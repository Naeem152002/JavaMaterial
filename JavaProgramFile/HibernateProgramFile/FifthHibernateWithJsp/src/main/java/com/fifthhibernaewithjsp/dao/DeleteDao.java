package com.fifthhibernaewithjsp.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fifthhibernaewithjsp.factoryprovider.FactoryProvider;

public class DeleteDao {
	public static boolean delete() {
		SessionFactory sessionFactory=FactoryProvider.getFactory();
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("delete from User where id");
		query.executeUpdate();
		Transaction beginTransaction = session.beginTransaction();
		beginTransaction.commit();
		session.close();
		return true;
	}
}

