package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.UserBean;
import connection.dbConnectio;


public class UserDaoImp implements UserDao 
{

	public String registerUser(UserBean UserBean) 
	{
		Connection connection =dbConnectio.getConnection();
		try {
			
			PreparedStatement preparedStatement1=connection.prepareStatement("select * from student where email=? and mobile=? ");
	 		preparedStatement1.setString(1,UserBean.getEmail());
			preparedStatement1.setString(2,UserBean.getMobile());
			
			ResultSet resultSet=preparedStatement1.executeQuery();
			if(resultSet.next())
			{
			return "Mobile or Email Already Exist";	
			}
			
			else
		    {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student(FirstName,LastName,Gender,Email,Password,Mobile) values (?,?,?,?,?,?)");
			preparedStatement.setString(1, UserBean.getFirstName());
			preparedStatement.setString(2, UserBean.getLastName());
			preparedStatement.setString(3, UserBean.getGender());
			preparedStatement.setString(4, UserBean.getEmail());
			preparedStatement.setString(5, UserBean.getPassword());
			preparedStatement.setString(6, UserBean.getMobile());
			
			
			int i=preparedStatement.executeUpdate();
		    if(i>0) 
		    {
		    	System.out.println(i);
		    	return "S";
		    }
			
			
			else
			{
				return "F";
			}
		
			
		
		    }
		}
	     
       catch (Exception e1)
		{
    	     e1.printStackTrace();
	}
		return null;
	
	}

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginUser(UserBean model) {
		// TODO Auto-generated method stub
		return null;
	}
}
