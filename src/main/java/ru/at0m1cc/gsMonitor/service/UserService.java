package ru.at0m1cc.gsMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.at0m1cc.gsMonitor.entity.User;
import ru.at0m1cc.gsMonitor.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
