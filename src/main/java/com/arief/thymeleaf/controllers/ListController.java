package com.arief.thymeleaf.controllers;

import com.arief.thymeleaf.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/person")
public class ListController {


    private List<Person> personList(){
        return  Arrays.asList(
          new Person(1,"Arief"),
          new Person(2,"Zack"),
          new Person(3,"Putro"),
          new Person(4,"Dominic")
        );
    }


    @RequestMapping("/list")
    public String listView(Model m){
        m.addAttribute("personList",personList());
        return "list/person-list";
    }
}
