package com.serilizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DSerial {
	public static void main(String []args) {
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student student=(Student)ois.readObject();
		//((Object) student).displayName();
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println(student.getAge());
		System.out.println(student.getAddress());
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
