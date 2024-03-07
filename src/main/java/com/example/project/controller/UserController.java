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
    @PostMapping()
    public UserResponse create(@RequestBody UserCreatingRequest userCreatingRequest){

        UserResponse userResponse = new UserResponse();
        userResponse.setFirstName(userCreatingRequest.getFirstName());
        userResponse.setMiddleName(userCreatingRequest.getMiddleName());
        userResponse.setLastName(userCreatingRequest.getLastName());

        return userResponse;
    }
}