package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
		public static Connection getConnection() {
			String url
	        = "jdbc:mysql://localhost:3306/login";
	    String username = "root"; // MySQL credentials
	    String password = "root";
	    Connection con = null;
	    try {
	    	con = DriverManager.getConnection(url, username, password);
		} catch (SQLException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		} 
	    return con;
		}
}
