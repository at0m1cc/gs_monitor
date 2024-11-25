package ru.at0m1cc.gsMonitor.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.at0m1cc.gsMonitor.entity.GrandSmeta;
import ru.at0m1cc.gsMonitor.entity.User;
import ru.at0m1cc.gsMonitor.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GrandSmetaService grandSmetaService;
    
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUserByName(String name){
        return userRepository.findByName(name);
    }
    
    public void updateUserGSVersion(String name, String softVersion){
        GrandSmeta grandSmeta = grandSmetaService.getGrandSmetaByVersion(softVersion);
        User user = getUserByName(name);
        user.setGrandSmeta(grandSmeta);
        userRepository.save(user);
    }
    public void updateUserDataUpdate(String name,LocalDate dataUpdate){
        User user = getUserByName(name);
        user.setDateUpdate(dataUpdate);
        userRepository.save(user);
    }
    
}
