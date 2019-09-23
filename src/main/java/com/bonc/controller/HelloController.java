package com.bonc.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class HelloController {
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "helloWorld";
    }
}
