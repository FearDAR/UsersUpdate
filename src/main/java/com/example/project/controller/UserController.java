package com.example.project.controller;

import com.example.project.controller.model.UserCreatingRequest;
import com.example.project.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public String returnHelloWorld(){
        return "hello world";
    }
    @PostMapping()
    public void create(@RequestBody UserCreatingRequest userCreatingRequest){
        userService.create(userCreatingRequest);
    }
}