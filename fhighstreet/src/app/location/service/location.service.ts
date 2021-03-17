import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Distance } from 'src/app/distance/model/distance';
@Injectable({
  providedIn: 'root'
})
export class LocationService {
  private stringUrl: string;
  constructor(private http: HttpClient) {
    this.stringUrl = 'http://localhost:8080/location'
  }
  public getAll(): Observable<any>{
    return this.http.get<Observable<any>>(this.stringUrl)
  }

  // tslint:disable-next-line:typedef
  public save(location: Location) {
    return this.http.post<Location>(this.stringUrl, location);
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
