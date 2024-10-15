class Car {
String car_name,model,color;
float price;
	
void showInfo()
	{
System.out.println(car_name);
System.out.println(model);
System.out.println(color);
System.out.println(price);
	}
void showDetails() {
car_name="maruti";
model="800";
color ="red";
price =3.5f;
	}
public static void main(String[] args) {
		
 Car c1=new Car();
 c1.showDetails();
 c1.showInfo();
}}
