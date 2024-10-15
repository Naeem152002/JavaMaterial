
	class Demo4{
		void show () {
			System.out.println("show of Demo");
			System.out.println(this);
		}
	}
	public class Test18 extends Demo4 {
		void disp () {
			System.out.println(this);
			System.out.println("show of Demooverride");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Test18 t =new Test18();
	t.show();
	t.disp();
		}
	}


