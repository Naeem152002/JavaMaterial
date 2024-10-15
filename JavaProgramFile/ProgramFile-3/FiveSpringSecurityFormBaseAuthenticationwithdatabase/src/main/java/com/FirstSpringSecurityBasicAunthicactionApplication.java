package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.entities.User;
import com.repo.UserRepo;

@SpringBootApplication
public class FirstSpringSecurityBasicAunthicactionApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringSecurityBasicAunthicactionApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		
		user.setEmail("john@gmail.com");
		user.setUserName("john");
		user.setPassword(this.passwordEncoder.encode("durgesh"));
		user.setRole("ROLE_NORMAL");
		
		this.userRepo.save(user);
		
		User user1=new User();
		
		user1.setEmail("don@gmail.com");
		user1.setUserName("don");
		user1.setPassword(this.passwordEncoder.encode("desh"));
		user1.setRole("ROLE_ADMIN");
		
		this.userRepo.save(user1);
		
		
	}
}
