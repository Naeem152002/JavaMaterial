//package com.dao;
//  
//import java.sql.*;  
//import java.util.ArrayList;  
//import java.util.List;
//
//import com.dto.Emp;
// 
//public class EmpDao {  
//  
//    public static Connection getConnection(){  
//        Connection con=null;  
//        try{  
//            Class.forName("com.mysql.jdbc.Driver");  
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");  
//        }catch(Exception e){System.out.println(e);}  
//        return con;  
//    }  
//  
//    public static List<Emp> getRecords(int start,int total){  
//        List<Emp> list=new ArrayList<Emp>();  
//        try{  
//            Connection con=getConnection();  
//            PreparedStatement ps=con.prepareStatement(  
//"select * from emp limit "+(start-1)+","+total);  
//            ResultSet rs=ps.executeQuery();  
//            while(rs.next()){  
//                Emp e=new Emp();  
//               e.setId(rs.getInt(1)); 
//               e.setName(rs.getString(2)); 
//                e.setSalary(rs.getFloat(3));  
//                list.add(e);  
//            }  
//            con.close();  
//        }catch(Exception e1){System.out.println(e1);}  
//        return list;  
//    }  
//}  