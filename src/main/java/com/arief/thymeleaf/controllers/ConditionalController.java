package com.arief.thymeleaf.controllers;

import com.arief.thymeleaf.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conditional")
public class ConditionalController {


    @Autowired
    private Person putro;

    @ModelAttribute
    public void addModelAttrs(Model m){
        m.addAttribute("admin",true);
        m.addAttribute("isChef",false);
        m.addAttribute("putro",putro);
        m.addAttribute("zack",new Person());
    }

    @RequestMapping
    public String conditionView(){
        return "pages/conditional";
    }
}
