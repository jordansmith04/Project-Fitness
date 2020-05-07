import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/model/User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  users: User[] = [];
  constructor(private userSerivce: UserService) { }

  onSubmit(){
    this.userSerivce.getUser()
    .subscribe(
      (data) => {
      console.log("success", data),
      this.users = data;
     },  (error) => {
       console.error("error", error)
     }
    )
  }

  ngOnInit() {
   
  }
}
