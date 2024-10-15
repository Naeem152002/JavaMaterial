package com.fifthhibernaewithjsp.dao;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fifthhibernaewithjsp.entities.User;
import com.fifthhibernaewithjsp.factoryprovider.FactoryProvider;

public class UserDao {
	private SessionFactory factory;
	public UserDao(SessionFactory factory) {
		this.factory=factory;
	}

    public static boolean getUserByEmailAndPassword(User user) {
        try  {
        	SessionFactory sessionFactory=FactoryProvider.getFactory();
        	Session session=sessionFactory.openSession();
        	Query query = session.createQuery("select name from User where email=:e and password=:p");
			query.setParameter("e", user.getEmail());
			query.setParameter("p", user.getPassword());
			List list = query.list();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

public static boolean userRegister(User user) {
	SessionFactory sessionFactory=FactoryProvider.getFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();
	session.close();
	return true;
}
public static boolean userLogin(User user) {
	SessionFactory sessionFactory=FactoryProvider.getFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();
	session.close();
	return true;
}
}

