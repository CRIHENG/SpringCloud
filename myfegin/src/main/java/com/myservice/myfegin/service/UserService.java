package com.myservice.myfegin.service;


import com.myservice.myfegin.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
public interface UserService {

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public User findById(@RequestParam("id") String id);

    @RequestMapping(value = "get-user",method = RequestMethod.POST)
    public User getUser(User user);
}
