import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import {User} from '../model/User'

@Injectable({
  providedIn: 'root'
})

let header = new HttpHeaders().set('Content-Type', 'application/json');

export class RegisterService {

  url = 'http://localhost:8080/user/userinfo';

  constructor(private http: HttpClient) { 

  }


  insertUser(user: User) {
    return this.http.post<any>(this.url, user);
  }

}
