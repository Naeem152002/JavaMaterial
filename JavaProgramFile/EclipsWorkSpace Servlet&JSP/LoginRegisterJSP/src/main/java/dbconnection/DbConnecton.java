package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConnecton {
	static Connection connection;
	public static Connection getConnection() {
		if (connection==null) {
			try {
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		}
		else {
			return connection;
		}
	}
}
