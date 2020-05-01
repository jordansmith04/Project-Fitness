import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/User';
import {FormsModule} from '@angular/forms'

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  onSubmit(value: any) {
    console.log(value)
  }

  constructor() { }

  ngOnInit(): void {
    // this.newUser();
  }

}
