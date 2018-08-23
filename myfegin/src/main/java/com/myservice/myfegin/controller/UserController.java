package com.myservice.myfegin.controller;

import com.myservice.myfegin.entity.User;
import com.myservice.myfegin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findById(@RequestParam("id") String id){
        return userService.findById(id);
    }
    @RequestMapping(value = "/get-user",method = RequestMethod.POST)
    public User getUser(User user){
        return userService.getUser(user);
    }

}
