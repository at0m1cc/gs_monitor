package ru.at0m1cc.gsMonitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/group")
@Controller
public class GroupController {
    
    @GetMapping("/{id}")
    public String getGroup(Model model, @PathVariable String id) {
        return null;
    }
    
}
