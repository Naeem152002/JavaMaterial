// without this second method
public class Test11 {
		int x=10;
		static Test11 t;
		void show(int x) {
			//int x=20;
			System.out.println(t.x);
			System.out.println(x);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 t=new Test11();
	t.show(20);
		}

	

}
