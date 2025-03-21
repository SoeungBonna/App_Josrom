package com.example.app_josrom.models;

public class UserModels {
    String name;
    String email;
    String password;

    public UserModels(){

    }
    public UserModels(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password =  password;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;

    }
    public void setPassword(){
        this.password = password;
    }

}
