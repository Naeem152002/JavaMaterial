package dao;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dto.UserDto;
import session.SessionProvider;

public class UserDao {
	public Serializable registerDao(UserDto userDto) {
		Session session=null;
		Serializable save=null;
		try {
			session = SessionProvider.getSession();
			Transaction transaction = session.beginTransaction();
			save = session.save(userDto);
			
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.evict(userDto);
		}
		return save;
	}
	public boolean LoginDao(UserDto userDto) {
		Session session=null;
		List list=null;
		try {
			session = SessionProvider.getSession();
			Query query = session.createQuery("select name from UserDto where email=:e and password=:p");
			query.setParameter("e", userDto.getEmail());
			query.setParameter("p", userDto.getPassword());
			list = query.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.evict(userDto);
		}
		return list.isEmpty();
	}
}
