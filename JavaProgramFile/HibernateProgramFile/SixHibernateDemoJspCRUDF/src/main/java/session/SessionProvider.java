package session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class SessionProvider {
	static Session session=null;
	public static Session getSession() {
		if (session==null) {
			Configuration configuration=new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			session=sessionFactory.openSession();
			return session;
		}else {
			return session;
		}
	}
}
