package com.example.springbootserver.platform.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodByeController {
    @RequestMapping(value = "/hello", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String login(@RequestBody User user) {
        return "hello " + user.getUsername() + ";你今年" + user.getAge() + "岁了";
    }
}
