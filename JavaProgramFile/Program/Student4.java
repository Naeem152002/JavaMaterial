//Deep copy :- refrence same or object same

public class Student 
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
		s.show();
		
		Student s1=new Student();
		s1=s;
		s1.show();
		
	}
}
 