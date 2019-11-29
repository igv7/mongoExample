package com.igor.mongoExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.igor.mongoExample.models.Person;
import com.igor.mongoExample.repo.PersonRepository;

@SpringBootApplication
public class MongoExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MongoExampleApplication.class, args);
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		System.out.println("Start");
		Person person1 = new Person(1, "Igor", 36);
		personRepository.save(person1);
		System.out.println("Stop");
	}

}
