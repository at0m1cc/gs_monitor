package ru.at0m1cc.gsMonitor.controller;

import java.sql.Struct;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.at0m1cc.gsMonitor.service.GrandSmetaService;
import ru.at0m1cc.gsMonitor.service.KeyService;
import ru.at0m1cc.gsMonitor.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    @Autowired
    private KeyService keyService;
    @Autowired
    private GrandSmetaService grandSmetaService;
    @Autowired
    private UserService userService;

    @GetMapping("/soShow")
    public String getUsers(Model model) {
        model.addAttribute("lastVersionGrandSmeta", grandSmetaService.getLastVersion());
        model.addAttribute("keys", keyService.getKeyAndUser());
        model.addAttribute("grandSmeta", grandSmetaService.getAllGrandSmeta());
        return "so";
    }

    @PostMapping("/soUpdate")
    public String postMethodName(Model model, @RequestParam(name = "userName") String userName, @RequestParam(name = "changeGS") String softversion, @RequestParam(name = "dataUpdate") LocalDate dataUpdate) {
        userService.updateUserGSVersion(userName, softversion);
        if(dataUpdate == null) {
            dataUpdate = LocalDate.now();
        }
        userService.updateUserDataUpdate(userName, dataUpdate);
        return getUsers(model);
    }
    
    
}