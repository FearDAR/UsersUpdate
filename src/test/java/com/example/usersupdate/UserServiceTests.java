package com.example.usersupdate;

import com.example.project.controller.model.UserCreatingRequest;
import com.example.project.service.user.UserService;
import com.example.project.service.user.db.User;
import com.example.project.service.user.db.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class UserServiceTests {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;
    @Before
    public void setup(){
    }

    @Test
    public void testSave(){
        UserCreatingRequest userCreatingRequest = new UserCreatingRequest();
        userService.create(userCreatingRequest);
        verify(userRepository, times(1)).save(any(User.class));

    }
}
