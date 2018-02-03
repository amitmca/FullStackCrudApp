package com.nikhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nikhil.entity.User;
import com.nikhil.repository.UserRepository;

@SpringBootApplication
public class FullStackCrudApplication implements CommandLineRunner
{
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(FullStackCrudApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception
	{
		userRepository.save(new User("one-firstName","one-lastName"));
		userRepository.save(new User("two-firstName","two-lastName"));
		userRepository.save(new User("three-firstName","three-lastName"));
	}
}
