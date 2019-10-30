package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("myvar", "Say hello to the people.");
        model.addAttribute("name", "My name is homePage! I am a public class and I return a String!");
        model.addAttribute("location", "My location is hometemplate.html");
        return "hometemplate";
    }
}
