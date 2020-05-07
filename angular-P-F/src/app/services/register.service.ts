import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import {User} from '../model/User'

@Injectable({
  providedIn: 'root'
})


export class RegisterService {

  url = 'http://localhost:8080/user/NewUser';

  constructor(private http: HttpClient) { 
    
  }

  insertUser(user: User){
    let headers = new HttpHeaders().set('Content-Type', 'application/json');
    let body = new HttpParams().set('username', user.getUsername().toString()).set('pass', user.getPass()).set('ages', user.getAge().toString()).set('heights', user.getHeight().toString()).set('weight', user.getWeight().toString());

    return this.http.post(this.url, body, {headers: headers})
    .subscribe(
      () => { //don't forget to subscribe to your observable!
      console.log("Request was successful.");
    },
      () => {
        console.log("Request was not successful!");
      });
  }

}

