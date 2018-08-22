package com.myservice.ribbon.controller;

import com.myservice.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private RestTemplate restTemplate;

        @GetMapping("/consumen")
        @ResponseBody
        public User getUser(@RequestParam("id") Long id) {
            return this.restTemplate.getForObject("http://provider/user/provider?id=" + id, User.class);
        }
}
