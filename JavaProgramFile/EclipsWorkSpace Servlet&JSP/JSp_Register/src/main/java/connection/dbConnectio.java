package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public final class dbConnectio implements DbInfo {


	static Connection connection =null;

	private dbConnectio()
	{

	}

	static public Connection getConnection()
	{
		if(connection==null)
		{
			try
			{
				Class.forName(DbInfo.DB_DRIVER);
				connection=DriverManager.getConnection(DbInfo.DB_URL,DbInfo.DB_USER_NAME,DbInfo.DB_PASSWORD);
				return connection;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			return connection;
		}
		return connection;
	}
}
