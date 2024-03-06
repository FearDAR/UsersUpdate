package com.example.project.controller;

import com.example.project.controller.model.UserCreatingRequest;
import com.example.project.controller.model.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String returnHelloWorld(){
        return "hello world";
    }
    @PostMapping("/create")
    public void create(@RequestBody UserCreatingRequest userCreatingRequest){
        System.out.println();
    }

    @PostMapping("/response")
    public UserResponse response(@RequestBody UserResponse userResponse) { return userResponse; }
}