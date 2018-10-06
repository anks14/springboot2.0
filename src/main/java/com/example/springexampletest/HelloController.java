package com.example.springexampletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {


    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/hello")
    public List<Person> hello () {

        return personRepository.findAll();

    }

}


