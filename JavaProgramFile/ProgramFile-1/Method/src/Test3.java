 
public class Test3 {
	
		String s1;
		Test3(String b){
			s1=b;
		}
		void show() {
			System.out.println(s1);
		}
	/*	}
		public String toString() {
			return s1;
		
		}*/

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Test3 t=new Test3("hi");
	t.show();
	System.out.println(t);
	String s=new String("hello");
	System.out.println(s);
	int i=t.hashCode();
	System.out.println(i);
	String hexString=Integer.toHexString(i);
System.out.println(hexString);
System.out.println(t.getClass().getName()+'@'+hexString);

			
	}
}

