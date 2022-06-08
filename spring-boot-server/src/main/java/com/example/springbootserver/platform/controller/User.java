package com.example.springbootserver.platform.controller;


import java.io.Serializable;

/**
 * @description :
 * @date : 2019/10/7 8:47
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

