// Without new object: isko memory pool area main milati hai aur dono same string ke liye memory share the same memory 
public class Test {
public static void main(String arg[]) {
	String s="hello";// object without new keyword 
	String s1="hello";
	System.out.println(s.equals(s1));
	System.out.println(s1==s);
	System.out.println(s.equals(s1));
	

}
}
// isme dono ka data same hai ye to dikh raha hai but dono ki memory same hai ye dekhana padega iske liye comprision
// kiya ja raha hai s.equals.(s1)se 

