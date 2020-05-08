import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { User } from '../model/User';
import { Observable, Subject } from 'rxjs';
import { FutureWorkouts } from '../model/FutureWorkouts';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUser(username): Observable<User>{
    let headers = new HttpHeaders({'Content-Type':  'application/json',
    'Access-Control-Allow-Credentials' : 'true',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET, POST, PATCH, DELETE, PUT, OPTIONS',
    'Access-Control-Allow-Headers': 'Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With'});
    return this.http.get<User[]>("http://localhost:8080/user/" + username, { headers: headers }) as unknown as Observable<User>;
  }

  private loginUsernameSource = new Subject<string>();
  loginUsername = this.loginUsernameSource.asObservable();

  sendUsername(message: string) {
    this.loginUsernameSource.next(message);
  }

  

  insertFutureWorkout(workout: FutureWorkouts){
    let array = {'username': workout.getUsername(), 'exercise': workout.getExercise().toString(), 'reps': workout.getReps()};
    let json = JSON.stringify(array);
    let headers = new HttpHeaders().set('Content-Type', 'application/json');
    // let body = new HttpParams().append(json);

    return this.http.post('http://localhost:8080/future/NewFuture', json, {headers: headers})
    .subscribe(
      () => { //don't forget to subscribe to your observable!
      console.log("Request was successful.");
    },
      () => {
        console.log("Request was not successful!");
      });
  }
  }

