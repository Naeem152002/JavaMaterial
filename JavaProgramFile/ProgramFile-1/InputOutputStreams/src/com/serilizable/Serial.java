package com.serilizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) {
	try {
	Student s1=new Student(1,"Naeem","naeem@gmail.com","Hardoi");
//	Student s2=new Student(2,"Gufran","gurfran@gmail.com","Vanaras");
//	Student s3=new Student(3,"Rehan","rehan@gmail.com","Kanpur");
//	
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\serial.txt");
	
	ObjectOutputStream oss=new ObjectOutputStream(fos);
	
	
	//how to serilaziable
	
	oss.writeObject(s1);
	oss.close();
	fos.close();
	System.out.println("Object stated is transfered to file ob!!");

}
	catch(IOException e) {
		e.printStackTrace();
	}
}}