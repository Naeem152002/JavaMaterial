package com.dao;

import java.util.*;

import com.db.ConnectionProvider;
import com.dto.Emp;

import java.sql.*;  
  
public class EmpDao {  
    public static int save(Emp e){  
        int status=0;  
        try{  
            Connection con=ConnectionProvider.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into emp360(name,password,email,country) values (?,?,?,?)");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=ConnectionProvider.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update emp360 set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
            status=ps.executeUpdate();    
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static boolean loginUser(Emp dto) {
        boolean userExists = false;
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionProvider.getConnection();
            String query = "SELECT * FROM emp360 WHERE name = ? AND email = ? AND country = ?";
            prepareStatement = connection.prepareStatement(query);
            prepareStatement.setString(1, dto.getName());
            prepareStatement.setString(2, dto.getEmail());
            prepareStatement.setString(3, dto.getCountry());
            resultSet = prepareStatement.executeQuery();

            if (resultSet.next()) {
                userExists = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (prepareStatement != null) prepareStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return userExists;

    }
	
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=ConnectionProvider.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from emp360 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){
        	e.printStackTrace();
        	}  
          
        return status;  
    }  
    public static Emp getEmployeeById(int id) {
        Emp e = null;

        // Define the database connection details
        String query = "SELECT * FROM emp360 WHERE id=?";

        // Use try-with-resources to ensure proper resource management
        try (Connection con = ConnectionProvider.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            // Set the parameter for the prepared statement
            ps.setInt(1, id);

            // Execute the query and process the result set
            try (ResultSet rs = ps.executeQuery()) {
                System.out.println(rs);
                if (rs.next()) {
                    e = new Emp();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setPassword(rs.getString(3));
                    e.setEmail(rs.getString(4));
                    e.setCountry(rs.getString(5));
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }

    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=ConnectionProvider.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp360");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    
    public static void main(String [] args) {
    	System.out.println(getEmployeeById(1));
    }
}
