 class Demo{
		void show() {
			disp();
			System.out.println("show ");
		}
		static void disp() {
			System.out.println("disp");
		}
}
 public class Test14{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Demo t=new Demo();
	t.disp();

	t.show();


	}

}
