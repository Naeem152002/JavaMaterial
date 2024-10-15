package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import session.SessionProvider;

public class DeleteDao {
	public static int delete(String id) {
		Session session = SessionProvider.getSession();
		Transaction beginTransaction = session.beginTransaction();
		Query query = session.createQuery("delete from UserDto where id="+id);
		int update = query.executeUpdate();
		beginTransaction.commit();
		return update;
	}
}
