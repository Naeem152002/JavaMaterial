package com.fifthhibernaewithjsp.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.fifthhibernaewithjsp.entities.User;
import com.fifthhibernaewithjsp.factoryprovider.FactoryProvider;


public class FetchDao {
	public FetchDao(){
		
	}
	public static   List fetch() {
		List list=null;
		try {
			SessionFactory sessionFactory=FactoryProvider.getFactory();
        	Session session=sessionFactory.openSession();
			Query query=session.createQuery("from User");
			 list=query.list();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	
	public static User fetchById(int id) {
		User dto=null;
		try {
			SessionFactory sessionFactory=FactoryProvider.getFactory();
			Session session=sessionFactory.openSession();
			dto = session.get(User.class, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return dto;
	}
	
}


