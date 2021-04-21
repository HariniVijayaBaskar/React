package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringBaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBaApplication.class, args);
	}
@Autowired
private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("harini","baskar","harini@gmail.com"));
		this.userRepository.save(new User("divya","g","divya@gmail.com"));
		this.userRepository.save(new User("riya","d","riya@gmail.com"));
		this.userRepository.save(new User("pavithra","sethu","pavi@gmail.com"));
		this.userRepository.save(new User("pooja","sathish","pooja@gmail.com"));
	}

}
