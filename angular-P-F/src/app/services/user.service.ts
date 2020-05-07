import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUser(username): Observable<User[]>{
    let headers = new HttpHeaders().set('Content-Type', 'application/json');
    return this.http.get<User[]>("http://localhost:8080/user/" + username, {headers: headers}) as Observable<User[]>;
  }
}
