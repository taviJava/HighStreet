import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Price } from '../model/price';

@Injectable({
  providedIn: 'root'
})
export class PriceService {
  private stringUrl: string;
  constructor(private http: HttpClient) {
    this.stringUrl = 'http://localhost:8080/price';
  }
  public getAll(): Observable<any>{
    return this.http.get<Observable<any>>(this.stringUrl);
  }

  // tslint:disable-next-line:typedef
  public save(price: Price) {
    return this.http.post<Price>(this.stringUrl, price);
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
