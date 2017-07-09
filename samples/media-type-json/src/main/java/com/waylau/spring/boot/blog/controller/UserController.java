package com.waylau.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waylau.spring.boot.blog.domain.User;

/**
 * User 控制器.
 * 
 * @since 1.0.0 2017年7月9日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/users")
public class UserController {
   
    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return new User(id,"waylau", "waylau521@gmail.com");
    }
}