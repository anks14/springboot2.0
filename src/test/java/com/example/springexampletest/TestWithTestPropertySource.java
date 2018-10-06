package com.example.springexampletest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringExampleTestApplication.class})
@TestPropertySource("classpath:test.properties")
public class TestWithTestPropertySource {

    @Autowired
    private PersonRepository personRepository;

    @Before
    public  void loadPeople() {

        personRepository.save(new Person("john","snow"));
        personRepository.save(new Person("tyrian","lannister"));


    }

    @Test
    public void  checkIfPeopleAreLoaded() {

        List<Person> persons = personRepository.findAll();
        System.out.println(persons.size());
    }

}
