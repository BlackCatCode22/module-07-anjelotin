package com.angelo.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/greeting")
    public String getGreeting() {
        return "Hi it's me angelo and I like pizza.";
    }

}
