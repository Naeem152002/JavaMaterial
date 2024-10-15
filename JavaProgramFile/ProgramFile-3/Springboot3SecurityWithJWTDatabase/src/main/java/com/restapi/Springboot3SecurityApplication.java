package com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.restapi.entities.User;
import com.restapi.repository.UserRepo;


@SpringBootApplication
public class Springboot3SecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3SecurityApplication.class, args);
	}
	
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		
		user.setEmail("john@gmail.com");
		user.setName("john");
		user.setPassword(this.passwordEncoder.encode("durgesh"));
		user.setRole("ROLE_NORMAL");
		
		this.userRepo.save(user);
		
		User user1=new User();
		
		user1.setEmail("don@gmail.com");
		user1.setName("don");
		user1.setPassword(this.passwordEncoder.encode("desh"));
		user1.setRole("ROLE_ADMIN");
		
		this.userRepo.save(user1);
		
		
	}
}
