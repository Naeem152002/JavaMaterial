 
public class Car {
	String car_name,model,color;
	float price;
	void showInfo
	
	()
	{
		System.out.println(car_name);
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
	}
	void showDetails() {
		car_name=
		"maruti";
		model="800";
		color ="red";
		price =3.5f;
	}

	void showDetails
	(String cn,String m,String c,float p) {
		
		car_name=cn;
		model=m;
		color=c;
		price=p;
	}
	public static void main(String[] args) {
		System.out.println("same type data ");
		// TODO Auto-generated method stub
 Car c1=new Car();
 c1.showDetails();
 c1.showInfo();

Car c2=new Car( );                      // same data different -2 object non paramatized method  
c2.showDetails();
c2.showInfo();

System.out.println("different type  ");//diffeernt data diffrent 2 object parametriezed 
Car c3=new Car();
Car c4=new Car();
c3.showDetails("arbas","700","green",7.6f);
c4.showDetails("tata","900","blue",6.9f);
c3.showInfo();
c4.showInfo();
	}

}
