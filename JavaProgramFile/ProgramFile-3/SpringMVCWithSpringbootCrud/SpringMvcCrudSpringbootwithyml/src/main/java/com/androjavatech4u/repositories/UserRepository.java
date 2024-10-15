package com.androjavatech4u.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.androjavatech4u.entities.UserEntintity;

@Repository
public interface UserRepository extends JpaRepository<UserEntintity, String>{

	public UserEntintity findByEmailAndPass(String email,String pass);
}
