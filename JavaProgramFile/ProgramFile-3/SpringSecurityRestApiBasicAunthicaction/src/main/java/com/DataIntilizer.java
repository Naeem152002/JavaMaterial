package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.config.AppConstants;
import com.entities.Role;
import com.repo.RoleRepo;


@Component
public class DataIntilizer implements CommandLineRunner{
	
	@Autowired
	private RoleRepo roleRepo;

	@Override
	public void run(String... args) throws Exception {
		try {
			Role role=new Role();
			role.setId(AppConstants.ADMIN_USER);
			role.setName("ROLE_ADMIN");
			
			Role role1=new Role();
			role1.setId(AppConstants.NORMAL_USER);
			role1.setName("ROLE_NORMAL");
			
			List<Role>roles=List.of(role,role1);
			
			List<Role>result=this.roleRepo.saveAll(roles);
			
			
			result.forEach(r->{
				System.out.println(r.getName());
			});
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}	
		
	}

}
