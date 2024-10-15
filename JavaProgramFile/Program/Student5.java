package com.selinum.testcases;

public class Student implements Cloneable
{
	 
	String name;
	int age;
	
	Student()
	{	
	}
	
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
  
	void show()
	{
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) 
	{
	 
		Student s=new Student("ram",34);
		System.out.println(s);
		s.show();
		
		try {
			Student	s1=(Student)s.clone();
			System.out.println(s1);
			
			System.out.println(s1.name+" "+s1.age);
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 	
	}
}
 