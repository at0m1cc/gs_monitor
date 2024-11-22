package ru.at0m1cc.gsMonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.at0m1cc.gsMonitor.service.GrandSmetaService;
import ru.at0m1cc.gsMonitor.service.KeyService;

@Controller
public class UserController {
    @Autowired
    private KeyService keyService;
    @Autowired
    private GrandSmetaService grandSmetaService;

    @GetMapping("/so")
    public String get(Model model) {
        model.addAttribute("lastVersionGrandSmeta", grandSmetaService.getLastVersion());
        model.addAttribute("keys", keyService.getKeyAndUser());
        model.addAttribute("grandSmeta", grandSmetaService.getAllGrandSmeta());
        return "so";
    }
    
}