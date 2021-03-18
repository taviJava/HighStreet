import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import {Distance} from '../model/distance';

@Injectable({
  providedIn: 'root'
})
export class DistanceService {
  private stringUrl: string;
  constructor(private http: HttpClient) {
    this.stringUrl = 'http://localhost:8080/distance';
  }
  public getAll(): Observable<any>{
    return this.http.get<Observable<any>>(this.stringUrl);
  }

  // tslint:disable-next-line:typedef
  public save(distance: Distance) {
    return this.http.post<Distance>(this.stringUrl, distance);
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
