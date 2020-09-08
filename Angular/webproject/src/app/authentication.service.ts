import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor() { }

  authenticate(username, password) {
    if (username === "java" && password === "pass") {
      sessionStorage.setItem('username', username)
      return true;
    } else {
      return false;
    }
  }

  authenticateadmin(username, password) {
    if (username === "admin" && password === "admin") {
      sessionStorage.setItem('username', username)
      return true;
    } else {
      return false;
    }
  }
  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null) && !(user === 'admin')
  }

  isAdminLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null) && (user === 'admin');
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
}