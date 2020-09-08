import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  constructor(private loginService: AuthenticationService) { }

  ngOnInit(): void {
  }

  isUserLoggedIn(){
    return this.loginService.isUserLoggedIn();
  }

  isAdminLoggedIn(){
    return this.loginService.isAdminLoggedIn();
  }
}
