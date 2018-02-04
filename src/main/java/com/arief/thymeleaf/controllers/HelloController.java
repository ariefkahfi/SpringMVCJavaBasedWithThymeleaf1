package com.arief.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String sayHello(ModelMap mm){
        mm.put("msg","Hello World");
        mm.put("msg2","Hello world with msg2");
        return "hello";
    }
}
