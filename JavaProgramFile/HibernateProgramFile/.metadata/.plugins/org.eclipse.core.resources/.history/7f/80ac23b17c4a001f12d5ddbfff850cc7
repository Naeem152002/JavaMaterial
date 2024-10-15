package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.db.FactoryProvider;
import com.dto.User;

public class UserDaoImpl implements UserDao {
	SessionFactory factory=FactoryProvider.getSessionFactory();

	@Override
	public boolean insert(User dto) {
		try {
		Session s=factory.openSession();
		s.beginTransaction();
		s.save(dto);
		s.getTransaction().commit();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return true;
	}
	@Override
	public User getByEmailAndName(User dto) {
	    User u = null;
	    String hql = "from User where name = :name and email = :email";
	    Session s = factory.openSession();
	    try {
	        u = (User) s.createQuery(hql)
	                .setParameter("name", dto.getName())
	                .setParameter("email", dto.getEmail())
	                .uniqueResult();
	    } finally {
	        s.close();
	    }
	    return u;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		List<User>users=null;
		String hql="from User";
		try{Session s=factory.openSession();
		users=s.createQuery(hql).list();
	}catch(Exception e) {
		e.printStackTrace();
	}
		return users;
	}
	@Override
	public User getById(int id) {
		User u=null;
		try{Session s=factory.openSession();
		u=s.get(User.class, id);
	}catch(Exception e) {
		e.printStackTrace();
	}
		return u;
	}

	@Override
	public boolean updateUser(User dto) {
		try  {Session s=factory.openSession();
             s.beginTransaction();
            s.update(dto);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return true;
	}

	@Override
	public boolean delteUser(int id) {
		try{Session s=factory.openSession();
		s.beginTransaction();
		User u=s.get(User.class, id);
		 s.delete(u);
		 s.getTransaction().commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
		return true;
	}

}
