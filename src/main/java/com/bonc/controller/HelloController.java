package com.bonc.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 * @RestController： 是@ResponseBody和@Controller的组合注解
 * @RequestMapping： 配置url映射，可以作用在控制器的某个方法上，也可以作用在此控制器类上
 */
@RestController
@RequestMapping("/demo")
public class HelloController {
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "helloWorld";
    }
}
