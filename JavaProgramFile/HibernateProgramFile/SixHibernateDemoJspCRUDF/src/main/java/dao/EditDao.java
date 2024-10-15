package dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dto.UserDto;
import session.SessionProvider;

public class EditDao {
	public static int edit(UserDto dto) {
		int update = 0;
		try {
			Session session = SessionProvider.getSession();
			session.clear();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(dto);
			update++;
//			Query query = session.createQuery("update UserDto set name=:n , email=:e , mobile=:m , password=:p where id=:i");
//			query.setParameter("n", dto.getName());
//			query.setParameter("e", dto.getEmail());
//			query.setParameter("m", dto.getMobile());
//			query.setParameter("p", dto.getPassword());
//			query.setParameter("i", dto.getId());
//			update = query.executeUpdate();
			transaction.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return update;
	}
}
