class Employee1   {

	String name;
	int age;
	
	Address a;
	Salary s;
	
	Employee1(String n, int a){
		name = n;
		age = a;
	}
	
	{
		a = new Address();
	}
	
	{
		s = new Salary();
	}
	
	
	void show(){
		
		System.out.println("Employee Name = "+name);
		System.out.println("Employee Age = "+age);
		
		System.out.println("Employee city = "+a.city);
		System.out.println("Employee state = "+a.state);
		System.out.println("Employee country = "+a.country);
		System.out.println("Ta = "+s.ta);
		System.out.println("Da  = "+s.da);
		System.out.println("Hra Name = "+s.hra);
		
	}
	
	public static void main(String aa[]){
		Employee1 e = new Employee1("Diwakar",25);
		e.show();
	}

}


class Address{
	String city;
	String state;
	String country;
	
	{
		city = "noida";
		state = "U.P";
		country = "India";
		
	}
	
}


class Salary{
	float ta;
	float da;
	float hra;
	
	{
		ta = 10000;
		da = 1000;
		hra = 100;
		
	}
	
}