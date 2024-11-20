package ru.at0m1cc.gsMonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.at0m1cc.gsMonitor.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/so")
    public String get(Model model) {
        // model.addAttribute("lastVersionGrandSmeta", )
        model.addAttribute("users", userService.getUsers());
        return "so";
    }
    
}