package com.javadevjournal.demoproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @RequestMapping("/")
    public String  index() {
        return "Welcome to My Website!";
    }

    @RequestMapping("/marissa")
    public String  marissa() {
        return "Welcome Marissa!";
    }

    @RequestMapping("/rashad")
    public String  rashad() {
        return "Welcome Rashad!";
    }

}
