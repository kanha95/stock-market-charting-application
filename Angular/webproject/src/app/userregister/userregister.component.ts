import { Component, OnInit } from '@angular/core';
import {UserServiceService} from '../user-service.service';
import {User} from '../user';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.scss']
})
export class UserregisterComponent implements OnInit {

  user : User = new User("", "");
  message : any;

  constructor(private service : UserServiceService) { }

  ngOnInit(): void {
  }

  public registerNow(){
    let response = this.service.doRegistration(this.user);
    response.subscribe(data => {
        this.message = data;
    })
  }

}
