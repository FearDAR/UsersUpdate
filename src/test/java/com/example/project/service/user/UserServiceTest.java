package com.example.project.service.user;

import com.example.project.controller.model.UserCreatingRequest;
import com.example.project.service.user.db.User;
import com.example.project.service.user.db.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest{
    @Mock
    private UserRepository userRepository;

    private UserService service;

    @Captor
    ArgumentCaptor<User> userArgumentCaptor;

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

        User expectedUser = new User();
        expectedUser.setFirstName(userCreatingRequest.getFirstName());
        expectedUser.setLastName(userCreatingRequest.getLastName());
        expectedUser.setMiddleName(userCreatingRequest.getMiddleName());

        service.create(userCreatingRequest);
        verify(userRepository).save(expectedUser);
    }

    @Test
    public void testCreatingAndCheckUsingArgumentCaptor(){
        UserCreatingRequest userCreatingRequest = new UserCreatingRequest();
        userCreatingRequest.setFirstName("Rogonov");
        userCreatingRequest.setLastName("Dima");
        userCreatingRequest.setMiddleName("Alex");

        service.create(userCreatingRequest);
        verify(userRepository).save(userArgumentCaptor.capture());

        User actualCreatedUser = userArgumentCaptor.getValue();
        Assertions.assertEquals(userCreatingRequest.getFirstName(), actualCreatedUser.getFirstName());
        Assertions.assertEquals(userCreatingRequest.getMiddleName(), actualCreatedUser.getMiddleName());
        Assertions.assertEquals(userCreatingRequest.getLastName(), actualCreatedUser.getLastName());
    }
}