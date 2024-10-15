package inf.practice;
interface I{
	void show();
}
interface I1{
	void show();
}


public class Test implements I, I1{
	public static void main(String[]args) {
		I1 t=new Test();
		t.show();
		
	}

	@Override
	public void show() {
		System.out.println("how are you");
		
	}
	

}
