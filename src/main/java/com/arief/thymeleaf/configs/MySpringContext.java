package com.arief.thymeleaf.configs;

import com.arief.thymeleaf.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringContext {

    @Bean
    public Person arief(){
        return new Person(1,"Arief");
    }

    @Bean
    public Person putro(){
        return new Person(2,"Putro");
    }
}
