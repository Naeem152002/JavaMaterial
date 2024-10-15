package com.ormwithout.ORMWithout;

import java.util.Scanner;

import com.ormwithout.dao.Dao;
import com.ormwithout.dto.Dto;
public class Emloyee 
{
    public static void main( String[] args )
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Id");
   int id=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the Name");
   String name=sc.nextLine();
   System.out.println("Enter the Address");
   String address=sc.nextLine();
   
   
   Dto dto=new Dto(id,name,address);
   Dao dao=new Dao();
   
   boolean check=dao.insertData(dto);
   
   if(check) {
	   System.out.println("Data Inserted Successfully");
   }
   else {
	   System.out.println("Error:Occured");
   }
   
   
}
}