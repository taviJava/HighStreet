import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Payment } from '../model/payment';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  private stringUrl: string;
  constructor(private http: HttpClient) {
    this.stringUrl = 'http://localhost:8080/payment'
  }
  public getAll(): Observable<any>{
    return this.http.get<Observable<any>>(this.stringUrl)
  }

  // tslint:disable-next-line:typedef
  public save(payment: Payment) {
    return this.http.post<Payment>(this.stringUrl, payment);
  }

  // tslint:disable-next-line:typedef
  public delete(id: number) {
    return this.http.delete(`${this.stringUrl}/${id}`);
  }


  // tslint:disable-next-line:typedef
  public getById(id: number): Observable<any> {
    return this.http.get(`${this.stringUrl}/${id}`);
  }
}
