// use this keyword 
public class Test9 {
		int x=10;
		void show(int x,Test9 t) {
			//int x=20;
			System.out.println(this.x);
			System.out.println(x);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Test9 t=new Test9();
	t.show(20,t);
		}

	}


