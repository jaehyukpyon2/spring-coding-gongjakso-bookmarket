package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/home")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to Book Market!");
        model.addAttribute("strapline", "Welcome to Shopping Mall!");
        return "welcome";
    }
}
