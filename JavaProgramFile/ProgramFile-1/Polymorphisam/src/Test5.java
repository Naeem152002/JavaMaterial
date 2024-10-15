class Z{
	int x=20;
	void show() {
		System.out.println("show");
	}
}
 class Test5 extends Z {
	int x=45;
	void show() {
		System.out.println("show of child");
	}
	//	public class Test5{
		public static void main(String args[]) {
			Z z=new Test5();
			//Z z= new P();
			System.out.println(z.x);
			System.out.println(z.x);
			z.show();
			
		}
			
		
	

}
