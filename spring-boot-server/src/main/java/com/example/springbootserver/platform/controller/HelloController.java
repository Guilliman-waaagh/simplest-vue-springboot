package com.example.springbootserver.platform.controller;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description :
 * @date : 2019/10/8 9:54
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello1", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String login(@RequestBody User user) {
        return "GoodBye " + user.getUsername() + ";你今年" + user.getAge() + "岁了";
    }
}

