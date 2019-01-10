package com.example.milan.mojmajstor.utils;

import com.example.milan.mojmajstor.LoginActivity;

public class User {

    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private LoginActivity.UserType userType;

    public User(String name, String surname, String email, String username, String password, LoginActivity.UserType userType) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.userType =userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginActivity.UserType getUserType() {
        return userType;
    }

    public void setUserType(LoginActivity.UserType userType) {
        this.userType = userType;
    }

    public boolean checkPassword(String password){
        return this.password == password;
    }

    public boolean checkUsername(String username){
        return this.username == username;
    }
}