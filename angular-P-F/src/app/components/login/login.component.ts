import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private userSerivce: UserService) { }

  onSubmit(){
    this.userSerivce.getUser()
    .subscribe(
      data => console.log("success", data),
    error => console.error("error", error))
  
  }

  ngOnInit() {
   
  }
}
