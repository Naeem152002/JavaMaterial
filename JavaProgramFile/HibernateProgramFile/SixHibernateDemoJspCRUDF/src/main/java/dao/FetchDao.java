package dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dto.UserDto;
import session.SessionProvider;

public class FetchDao {
	public FetchDao(){
		
	}
	public  List fetch() {
		UserDto dto = null;
		Session session2 = null;
		List list=null;
		try {
			session2=SessionProvider.getSession();
			Query query=session2.createQuery("from UserDto");
			list=query.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			session2.close();
		}
		return list;
	}
	public static UserDto fetchById(int id) {
		UserDto dto = null;
		Session session2 = null;
		try {
			session2=SessionProvider.getSession();
			dto = session2.get(UserDto.class, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return dto;
	}
	
}
