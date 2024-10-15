
public class Test4 {
	String string;
		public Test4(String string) { 
			this.string=string;
		}
		@Override
		public String toString() {
			//return getClass().getName()+"t"+Integer.toHexString(hashCode());
			return string;
		}
		public static void main(String arg[]) {
			Test4 t=new Test4("he");
			Test4 t1=new Test4("bye");
			String s="hello";// object without new keyword 
		System.out.println(s);
			System.out.println(t);
			System.out.println(t1);
		}
	}


