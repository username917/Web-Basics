package com.example.MyThirdSpringBootProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
    @Value("SpringBoot 2")
    String secondName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
    
    @GetMapping("/page2")
    public String pageTwo(Model model) {
    	
    	model.addAttribute("secondName", secondName);
    	return "index";
    }
}
