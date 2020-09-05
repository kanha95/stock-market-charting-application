package com.stocks.loginservice.services;

import com.stocks.loginservice.entity.ConfirmationToken;
import com.stocks.loginservice.entity.User;
import com.stocks.loginservice.repository.ConfirmationTokenRepository;
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
    private UserRepository userRepository;

    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;

    public void addUser(User user) {
        userRepository.save(user);
        ConfirmationToken t = new ConfirmationToken(user);
        confirmationTokenRepository.save(t);
    }

    public String[] loginUser(User user) {
        Optional<User> u = userRepository.findByUserName(user.getUserName());

        String[] user_info = new String[2];

        if (u.isPresent() && u.get().getPassword().equals(user.getPassword())) {
            user_info[0] = u.get().getUserName();
            user_info[1] = confirmationTokenRepository.findTokenByUser(u.get()).get().getToken();
            return user_info;
        } else {
            user_info[0] = "No such user found";
            user_info[1] = "No such user found";
            return user_info;
        }
    }

    public boolean checkToken(String token) {
        Optional<ConfirmationToken> t = confirmationTokenRepository.findTokenByToken(token);
        return t.isPresent();
    }

    public void logoutUser(User user) {
        Optional<User> u = userRepository.findByUserName(user.getUserName());
        if (u.isPresent() && u.get().getPassword().equals(user.getPassword())) {
            confirmationTokenRepository.deleteByUser(user);
        }
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }


}