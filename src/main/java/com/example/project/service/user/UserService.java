package com.example.project.service.user;

import com.example.project.controller.model.UserCreatingRequest;
import com.example.project.service.user.db.User;
import com.example.project.service.user.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void create(UserCreatingRequest userCreatingRequest){
        User user = new User();
        user.setFirstName(userCreatingRequest.getFirstName());
        user.setMiddleName(userCreatingRequest.getMiddleName());
        user.setLastName(userCreatingRequest.getLastName());
        userRepository.save(user);
    }
}
