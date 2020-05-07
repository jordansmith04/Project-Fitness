import { Component, OnInit, Input } from '@angular/core';
import {User} from '../../model/User'
import { UserService } from 'src/app/services/user.service';


@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  @Input() post: User;

  users: User[] = [];

  constructor(private userService :UserService) { }

  ngOnInit() {
   this.userService.getUser("admin")
   .subscribe(data => this.users = data)
  
  }
  

}
