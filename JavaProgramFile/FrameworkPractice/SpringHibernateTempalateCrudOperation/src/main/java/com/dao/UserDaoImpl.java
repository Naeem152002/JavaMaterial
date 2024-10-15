package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dto.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
    @Transactional
	@Override
	public boolean insert(User dto) {
		hibernateTemplate.save(dto);
		return true;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public User getByEmailAndName(User dto) {
		String hql="from User where name=:name and email=:email";
		List<User>users=(List<User>) hibernateTemplate.findByNamedParam(hql, new String[] {"name","email"},
				new Object[] {dto.getName(),dto.getEmail()});
		return users.isEmpty()?null:users.get(0);
	}

	@Override
	public List<User> getAllUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User getById(int id) {
		return hibernateTemplate.get(User.class, id);
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
	User	user=hibernateTemplate.get(User.class, id);
	hibernateTemplate.delete(user);
		return true;
	}

}
