package com.stocks.loginservice.services;

import com.stocks.loginservice.entity.User;
import com.stocks.loginservice.models.UserModel;
import com.stocks.loginservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findByUserName(username);


        user.orElseThrow(() -> new UsernameNotFoundException("User Not Found: " + username));
        return user.map(UserModel::new).get();
    }


}