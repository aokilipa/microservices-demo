package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;
import com.example.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId){
        return service.getUserWithDepartment(userId);
    }
}
