package com.stocks.loginservice.controllers;

import com.stocks.loginservice.entity.User;
import com.stocks.loginservice.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
	@Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @PostMapping("/user/login")
    public String[] loginUser(@RequestBody User user) {
        return userService.loginUser(user);
    }

    @PostMapping("/user/check")
    public boolean checkToken(@RequestBody String token) {
        return userService.checkToken(token);
    }

    @PostMapping("/user/logout")
    public void logoutUser(@RequestBody User user) {
        userService.logoutUser(user);
    }

    @GetMapping("/user/sign-up")
	String signUpPage(User user) {

		return "Please Sign up via a post request!";
    }
    
    @PostMapping("/user/sign-up")
	String signUp(@RequestBody User user) {

		userService.addUser(user);

		return "redirect:/user";
	}

}