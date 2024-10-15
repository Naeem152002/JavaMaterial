package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dto.User;
@Repository
@Transactional
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insert(User dto) {
		hibernateTemplate.save(dto);
		
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public User getByEmailAndName(User dto) {
		String hql="from User where name=:name and email=:email";
		List<User>users=(List<User>) hibernateTemplate.findByNamedParam(hql, new String[] {"name","email"}, new Object[] {dto.getName(),dto.getEmail()});
		return users.isEmpty()?null:users.get(0);
	}

	@Override
	public List<User> getAllUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User getUsersById(int id) {
		return hibernateTemplate.get(User.class, id);
	}

	@Override
	public void updateUser(User dto) {
		hibernateTemplate.update(dto);
		
	}

	@Override
	public void deleteUser(int id) {
		User u=hibernateTemplate.get(User.class, id);
		hibernateTemplate.delete(u);
		
		
	}

}
