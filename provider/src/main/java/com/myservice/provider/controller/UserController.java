package com.myservice.provider.controller;

import com.myservice.provider.dao.UserDao;

import com.myservice.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    public User findUser(@RequestParam("id") long id){
       return userDao.findOne(id);
    }

    @RequestMapping(value = "/get-user",method = RequestMethod.POST)
    @ResponseBody
    public User getUser(@RequestBody User user){
        return user;
    }

}
