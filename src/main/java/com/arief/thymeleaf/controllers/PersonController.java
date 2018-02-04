package com.arief.thymeleaf.controllers;

import com.arief.thymeleaf.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {


    @Autowired
    private Person arief;

    @RequestMapping("/one")
    public String personOne(Model m){
        m.addAttribute("person",arief);
        return "pages/person";
    }

    @RequestMapping("/two")
    public String personTwo(Model m){
        return null;
    }
}
