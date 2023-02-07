package com.example.mvvp_activity.model;

public class Model {

    private String email;
    private Integer password;

    public Model(String email, Integer password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
