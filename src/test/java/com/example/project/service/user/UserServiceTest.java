package com.example.project.service.user;

import com.example.project.controller.model.UserCreatingRequest;
import com.example.project.service.user.db.User;
import com.example.project.service.user.db.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest{
    @Mock
    private UserRepository userRepository;

    private UserService service;

    @BeforeEach
    void setUp() {
        service = new UserService(userRepository);
    }

    @Test
    public void testCreating(){
        UserCreatingRequest userCreatingRequest = new UserCreatingRequest();
        userCreatingRequest.setFirstName("Rogonov");
        userCreatingRequest.setLastName("Dima");
        userCreatingRequest.setMiddleName("Alex");

        userService.create(userCreatingRequest);
        verify(userRepository, times(1)).save(any(User.class));

    }
}