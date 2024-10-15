
public class Test1 {
		public static void main(String arg[]) {
			Test1 t=new Test1();
			Test1 t1=new Test1();
			String s="hello";// object without new keyword 
			String s1="hello";
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s.equals(s1));// content compare kara raha  hai String class ka equal method chala kyuki
			// String ke object per call kiya hai yaha par
			System.out.println(t);
			System.out.println(t1);
			System.out.println(t.equals(t1));// object class ke equal method ko call kar raha hai 
			System.out.println(s==s1);// == equal operator bhi object class ke equal method ki tarah kam karata
			// string ki object memory ke andar bane honge unki id ko compare karate hai
			String s2="Hello";
			System.out.println(s.equals(s2));
		}
		}


