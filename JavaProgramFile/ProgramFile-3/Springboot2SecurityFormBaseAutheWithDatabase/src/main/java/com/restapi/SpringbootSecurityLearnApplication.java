package com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.restapi.entities.User;
import com.restapi.repo.UserRepo;

@SpringBootApplication
public class SpringbootSecurityLearnApplication implements CommandLineRunner {
    
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		
		user.setEmail("john@gmail.com");
		user.setUserName("john");
		user.setPassword(this.bCryptPasswordEncoder.encode("durgesh"));
		user.setRole("ROLE_NORMAL");
		
		this.userRepo.save(user);
		
		User user1=new User();
		
		user1.setEmail("don@gmail.com");
		user1.setUserName("don");
		user1.setPassword(this.bCryptPasswordEncoder.encode("desh"));
		user1.setRole("ROLE_ADMIN");
		
		this.userRepo.save(user1);
		
		
	}

}
