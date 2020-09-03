package com.stocks.loginservice.services;

import com.stocks.loginservice.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserService implements UserDetailsService {



    //implement this for user repository
    // @Autowired
    // UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        //change this for JPA integration, use the userRepositpry
        return new User(username,"password");
    }


}