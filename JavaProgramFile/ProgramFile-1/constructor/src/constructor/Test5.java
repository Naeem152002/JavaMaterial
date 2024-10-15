package constructor;

public class Test5 {
	String name ,color,mobile;
	 int age, price;
	void showInfo() {
		System.out.println("Name  "+name);
		System.out.println("color "+color);
		System.out.println(age);
		System.out.println(price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test5 t=new Test5();
t.name="naeem";
t.color="blue";
t.age=78;
t.price=5678;
t.showInfo();
Test5 t1=new Test5();
t1.name="sahid";
t1.color="red";
t1.age=34;
t1.price=8976;
t1.showInfo();
	}

}
