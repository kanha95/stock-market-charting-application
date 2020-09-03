package com.stocks.loginservice.models;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.stocks.loginservice.entity.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserModel implements UserDetails {
	/**
     *
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private int confirmed;
    private String password;
    private String userType;
    private String userName;
    private int contactId;


    private boolean active;
    private List<GrantedAuthority> authorities;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true ;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    public UserModel(User user){
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.active = user.getActive();
        this.authorities = Arrays.stream(user.getRoles().split(","))
        .map(SimpleGrantedAuthority::new)
        .collect(Collectors.toList());
    }

    public UserModel(String username, String password){
        this.userName = username;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConfirmed() {
        return this.confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getContactId() {
        return this.contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

}