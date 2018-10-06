package com.example.springexampletest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {H2Config.class,SpringExampleTestApplication.class})
@ActiveProfiles("test")
public class TestWithActiveProfileAndConfig {

	@Autowired
	private PersonRepository personRepository;

	@Before
	public  void load() {

		personRepository.save(new Person("ankit","gupta"));

	}

	@Test
	public void  testPerson() {

		List<Person> persons = personRepository.findAll();
		System.out.println(persons.size());
	}

}
