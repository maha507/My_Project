package com.example.my_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Home Page");
        return "home";  // This refers to home.jsp
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to the Index Page");
        return "index";  // This refers to index.jsp
    }
}
