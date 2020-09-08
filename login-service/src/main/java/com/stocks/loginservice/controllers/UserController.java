package com.stocks.loginservice.controllers;

import com.stocks.loginservice.entity.User;
import com.stocks.loginservice.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @PostMapping("/admin/login")
    public String admin(@RequestBody User user) {
        return userService.adminLogin(user);
    }

    @PostMapping("/admin/sign-up")
    public String adminSignUp(@RequestBody User user) {

        if(!user.getRoles().equals("ADMIN"))
            return "You can't signup as an admin!";
		userService.addAdmin(user);
		return "redirect:/admin/login";
	}

    @PostMapping("/user/login")
    public String[] loginUser(@RequestBody User user) {
        return userService.loginUser(user);
    }

    @PostMapping("/user/logout")
    public void logoutUser(@RequestBody User user) {
        userService.logoutUser(user);
        //return "User: " + user.getUserName() + " Successfully logged out!" ;

    }

    @GetMapping("/user/sign-up")
	String signUpPage(User user) {

		return "Please Sign up via a post request!";
    }
    
    @PostMapping("/user/sign-up")
    @CrossOrigin
	String signUp(@RequestBody User user) {

		userService.addUser(user);
		return "redirect:/user/login";
	}

}