import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import {User} from '../model/User'

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  url = 'http://localhost:8080/user/userinfo';

  constructor(private http: HttpClient) { 

  }

  insertUser(user: User) {
    return this.http.post<any>(this.url, user);
  }

}
