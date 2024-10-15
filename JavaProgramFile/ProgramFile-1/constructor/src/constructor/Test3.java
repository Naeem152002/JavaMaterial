package constructor;

public class Test3 {
	int x;
	{
		x=19;
		System.out.println(x); 
	}
	
Test3(){
	System.out.println("default constructor ");
}
Test3(int x){
System.out.println(x);	
}
Test3(int x,int y){
	System.out.println(x);
	System.out.println(y);
}{
	System.out.println("int block");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test3();
 new Test3(4);
 new Test3(7,9);
	}

}
