package com.service;
import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.dto.UserDto;
import com.entities.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
  private HibernateTemplate hibernateTemplate;
    @Override
    public User save(User user) {
    	 Serializable id = this.hibernateTemplate.save(user);

    	    // Retrieve the saved user object using the id
    	    User user2 = null;
    	    if (id != null) {
    	        user2 = this.hibernateTemplate.get(User.class,  id);
    	    }

    	    // Return the saved user object
    	    return user2;
    }
 
    @Override
    public User getUserById(int id) {
        return hibernateTemplate.get(User.class, id);
    }

    @Override
    public boolean getUsersNameAndEmail(String email,String password ) {
    	this.hibernateTemplate.execute(session -> session.createQuery("SELECT new User(u.name, u.email) FROM User u", User.class).list());
      return true;
    }

    @Override
    public void updateUser(User user) {
    	this.hibernateTemplate.update(user);

    
    }
    @Override
    public void deleteUser(User user) {
    	this.hibernateTemplate.delete(user); 
    }
  
    @Override
	public List<User> findAll() {
		return hibernateTemplate.loadAll(User.class);
	}

	
}
