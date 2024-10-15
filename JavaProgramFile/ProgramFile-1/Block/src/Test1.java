// kisi class ka object banata to uski refernce id banati hai uska sara code jo likha hota hai object class ke to string method mai 
//likha hota hai
public class Test1{
	String s1;
	/*Test1(String b){
		s1=b;
	}*/
	public String toString() {
		return "Naeem";
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t=new Test1();
System.out.println(t);
String s=new String("hello");
System.out.println(s);
	}


}

