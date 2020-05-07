import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/User';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUser(username): Observable<User[]>{
    let headers = new HttpHeaders({'Content-Type':  'application/json',
    'Access-Control-Allow-Credentials' : 'true',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET, POST, PATCH, DELETE, PUT, OPTIONS',
    'Access-Control-Allow-Headers': 'Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With'});
    return this.http.get<User[]>("http://localhost:8080/user/" + username, {headers: headers}) as Observable<User[]>;
  }

  private loginUsernameSource = new Subject<string>();
  loginUsername = this.loginUsernameSource.asObservable();

  sendUsername(message: string) {
    this.loginUsernameSource.next(message);
  }

}
