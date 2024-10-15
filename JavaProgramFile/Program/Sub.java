package p2;
import p1.Add;

public class Sub{
	int a = 22;
	int b = 10;
	
	
	public void subtraction(){
		int c = a-b;
		System.out.println("subtraction value is : "+c);
	}
	
	public static void main(String [] args){
		
		Sub s = new Sub();
		s.subtraction();
		Add add = new Add();
		add.adding();
		
	}
}