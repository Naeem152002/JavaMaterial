 class StudentSelectedInInterview {
	String name;
	static String clgname,company;
	int roll ,age;
	static float salary;
	
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
		StudentSelectedInInterview t1=new StudentSelectedInInterview ("rahul","igano","tcs",34,23,4400.5f);
		StudentSelectedInInterview t2=new StudentSelectedInInterview ("deewakar","igano","tcs",35,24,4400.5f);
		StudentSelectedInInterview t3=new StudentSelectedInInterview ("vinos","igano","tcs",37,72,4400.5f);
		
t1.show();
t2.show();
t3.show();


}



	

}
