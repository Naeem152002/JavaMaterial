package com.fifthhibernaewithjsp.dao;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fifthhibernaewithjsp.entities.User;
import com.fifthhibernaewithjsp.factoryprovider.FactoryProvider;

public class EditDao {
	public static int edit(User u) {
		int update = 0;
		try {
			SessionFactory sessionFactory=FactoryProvider.getFactory();
			Session session = sessionFactory.openSession();
			//session.clear();
			Transaction transaction = session.beginTransaction();
			//session.saveOrUpdate(u);
			//update++;
	       Query query = session.createQuery("update UserDto set name=:n , email=:e , mobile=:m , password=:p where id=:i");
			query.setParameter("n", u.getName());
		query.setParameter("e", u.getEmail());
		query.setParameter("m", u.getMobile());
		query.setParameter("p", u.getPassword());
			query.setParameter("i", u.getId());
			update = query.executeUpdate();
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return update;
	}
}

