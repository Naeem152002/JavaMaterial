package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.entities.User;
import com.repo.UserRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u=new User();
		u.setName("Naeem");
		u.setEmail("naeem@gmail.com");
		u.setPassword(passwordEncoder.encode("1234"));
		u.setMobile("84949494949");
	    u.setRole("ROLE_ADMIN");
	    
	    userRepo.save(u);
	    
	    
	    User u1=new User();
		u1.setName("Gufran");
		u1.setEmail("gufran@gmail.com");
		u1.setPassword(passwordEncoder.encode("5678"));
		u1.setMobile("84949494");
	    u1.setRole("ROLE_NORMAL");
	    
	    userRepo.save(u1);
		
	}

}
