import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http : HttpClient) { }

  public doRegistration(user){
    console.log(user.userName)
    return this.http.post("http://localhost:8085/user/sign-up", user, {responseType : "text" as "json"});
  }
}
