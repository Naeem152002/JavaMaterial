/*jab bhi kisi class ka object bananta hai to kisi bhi class ka object banate hi  object ki refernce id banati hai
ref id banane ki saari jimmadari object class ke andar ek method hota ha jiska naam tostring method hota hai obect class 
jo ref id banati hai use return tostring method return karata hai aur us tostring method ko ovveride karake  koi banda 
apne hisab se logic likh sakata hai */
public class Test2 {
		public static void main(String arg[]) {
			Test2 t=new Test2();
			Test2 t1=new Test2();
			String s="hello";// object without new keyword 
			String s1="hello";
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s.equals(s1));
			System.out.println(s==s1);
			String s2="Hello";
			System.out.println(s.equals(s2));
			System.out.println(s.equalsIgnoreCase(s2 ));// first word ignore 
			System.out.println(s==s2);// refernece id 
			String s4=new String("hello");// ye dono jagah memory milegi
			System.out.println(s4); // yah per id nahi print hoti hai kyuki string class  yaha per tostring mehod
			// ovveride kiya hai
			System.out.println(t);// ya per id print hoti hai 
		}
		}




