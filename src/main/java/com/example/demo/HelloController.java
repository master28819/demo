package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf!");
        return "hello";
    }
}



/* package com.example.demo;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
//        model.addAttribute("name", "Spring Boot with Thymeleaf");
        return "hello"; // refers to hello.html in templates folder
    }

	@GetMapping("/")
	public String route(){
		return "Route H Yaar";
	}

}  */
