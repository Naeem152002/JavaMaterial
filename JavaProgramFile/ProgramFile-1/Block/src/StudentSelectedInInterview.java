
public class StudentSelectedInInterview {
	String name;
	//static ise lagane se memory bach jati hai
	static String clgname,company;
	int roll ,age;
	float salary;
	
	StudentSelectedInInterview (String n,String c1,String cm,int r,int a,float s ) {
		name=n;
		clgname=c1;
		company=cm;
		roll=r;
		age=a;
		salary=s;
	}
	void show () {
		System.out.println(name);
		System.out.println(clgname);
		System.out.println(company);
		System.out.println(roll);
		System.out.println(age);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSelectedInInterview t1=new StudentSelectedInInterview ("jeeshan","spbd","wipro",234,32,24.5f);
		StudentSelectedInInterview t2=new StudentSelectedInInterview ("aman","spbd","wipro",564,67,84.5f);
		StudentSelectedInInterview t3=new StudentSelectedInInterview ("ayan","spbd","wipro",237,72,94.5f);
		StudentSelectedInInterview t4=new StudentSelectedInInterview ("stdt","spbd","wipro",294,02,74.5f);
		StudentSelectedInInterview t5=new StudentSelectedInInterview ("tyur","spbd","wipro",934,762,90.5f);
t1.show();
t2.show();
t3.show();
t4.show();
t5.show();







	}

}
