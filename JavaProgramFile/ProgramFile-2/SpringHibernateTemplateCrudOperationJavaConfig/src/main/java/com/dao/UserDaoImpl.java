package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dto.User;
@Component(value="dao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

    @Transactional
	@Override
	public boolean insert(User dto) {
		hibernateTemplate.save(dto);
		return true;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public User getByEmailAndName(User dto) {
		String hql="from User where name=:name and email=:email";
		List<User>users=(List<User>) hibernateTemplate.findByNamedParam(hql, new String[] {"name","email"}, new Object[] {dto.getName(),dto.getEmail()});
		return users.isEmpty()?null:users.get(0);
	}
   
	@Override
	public List<User> getAllUsers() {
		List<User>users=hibernateTemplate.loadAll(User.class);
		return users;
	}
	@Override
	public User getById(int  id) {
		User u= hibernateTemplate.get(User.class, id);
		return u;
	}
    @Transactional 
	@Override
	public boolean updateUser(User dto) {
	hibernateTemplate.update(dto);
		return true;
	}
    @Transactional
	@Override
	public boolean deleteUser(int id) {
		User u= hibernateTemplate.get(User.class, id);
		hibernateTemplate.delete(u);
		return true;
	}

}
