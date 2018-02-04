package com.arief.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArithmeticController {

    @RequestMapping("/add")
    public String addMapping(Model m){
        m.addAttribute("one",25);
        return "pages/arithmetic";
    }
}
