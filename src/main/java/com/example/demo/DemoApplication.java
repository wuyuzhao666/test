package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public InitializingBean saveData(PersonRepository personRepository){
		return () -> {
			personRepository.save(new Person(1L ,"J"));
			personRepository.save(new Person(2L ,"q"));
		};

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
