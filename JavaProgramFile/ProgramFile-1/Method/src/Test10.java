
//with out this first method
public class Test10 {
		int x=10;
		int show(byte x) {
			Test10 t=new Test10();
			System.out.println(x);
			System.out.println(t.x);
			System.out.println(t);
			System.out.println(this);
			return 20;
		}
		float Test10()
		{
			System.out.println(this);
			return 24f;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Test10 t=new Test10();
	
	float f=t.Test10();
	System.out.println(f);
	t.show((byte)20);
		}

	}


