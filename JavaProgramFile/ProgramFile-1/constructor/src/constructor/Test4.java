package constructor;

public class Test4 {
Test4(){
	System.out.println("dafault constructor ");
}
{
	System.out.println("int block ");
}
{
	System.out.println("int block2");
}
public static void main (String naeem []) {
	new Test4 ();
	new Test4();
	{
		
		System.out.println("init block5");
	}

		System.out.println("main");
}

{
	System.out.println("int block3");
}

}
