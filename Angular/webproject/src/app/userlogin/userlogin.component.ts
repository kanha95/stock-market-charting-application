import { Component, OnInit } from '@angular/core';
import {UserServiceService} from '../user-service.service';
import {User} from '../user';
import { AuthenticationService } from '../authentication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.scss']
})
export class UserloginComponent implements OnInit {
  user : User = new User("", "");
  message : any;
  invalidLogin = false

  constructor(private router: Router,
    private loginservice: AuthenticationService) { }

  ngOnInit(): void {
  }

  checkLogin() {
    if (this.loginservice.authenticate(this.user.userName, this.user.password)
    ) {
      this.router.navigate([''])
      this.invalidLogin = false
    } else{
      this.invalidLogin = true
      this.message = "Invalid Login, Please Try Again !!!"
    }
  }
}
