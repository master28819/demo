package com.example.demo;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
//        model.addAttribute("name", "Spring Boot with Thymeleaf");
        return "hello"; // refers to hello.html in templates folder
    }
}
