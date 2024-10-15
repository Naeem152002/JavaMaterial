//shellow copy

public class Student1 
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
		s1.name=s.name;
		s1.age=s.age;
		s1.show();
		
	}
}
 