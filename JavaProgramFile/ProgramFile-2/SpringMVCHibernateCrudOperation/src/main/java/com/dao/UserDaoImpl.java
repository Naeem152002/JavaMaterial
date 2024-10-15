package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dto.User;
import com.factoryprovider.FactoryProvider;
@Repository
public class UserDaoImpl implements UserDao{
	SessionFactory factory=FactoryProvider.getSessionFactory();

	@Override
	public void insert(User dto) {
		try {
		Session s=factory.openSession();
		s.beginTransaction();
		s.save(dto);
		s.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public User getByEmailAndName(User dto) {
		String hql="from User where name=:name and email=:email";
		User u=null;
		try {
			Session s=factory.openSession();
			u=(User)s.createQuery(hql)
			.setParameter("name", dto.getName())
			.setParameter("email", dto.getEmail())
			.uniqueResult();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql="from User";
		List<User>users=null;
		
		try {
			Session s=factory.openSession();
			users=s.createQuery(hql).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User getUsersById(int id) {
		User u=null;
		try {
			Session s=factory.openSession();
		u=s.get(User.class, id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void updateUser(User dto) {
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			s.update(dto);
			s.getTransaction().commit();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}

	@Override
	public void deleteUser(int id) {
		try {
			Session s=factory.openSession();
			s.beginTransaction();
			User u=s.get(User.class, id);
			s.delete(u);
			s.getTransaction().commit();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}
		
	}

