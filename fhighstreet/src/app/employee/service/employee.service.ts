import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Distance } from 'src/app/distance/model/distance';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private stringUrl: string;
  constructor(private http: HttpClient) {
    this.stringUrl = 'http://localhost:8080/employee'
  }
  public getAll(): Observable<any>{
    return this.http.get<Observable<any>>(this.stringUrl)
  }

  // tslint:disable-next-line:typedef
  public save(employee: Employee) {
    return this.http.post<Employee>(this.stringUrl, employee);
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
