class Test{
public static void main(String args[]){
String s1="surya";
String s2="Surya";
String s3="surya";
String s4="naeem";
String s11=new String("surya");
String s22=new String("Surya");
String s33=new String("surya");
String s44=new String("naeem");
System.out.println(s1.equals(s1));//true
System.out.println(s1.equals(s22));//false

System.out.println(s1==s11);//true
System.out.println(s1==s22);//false

System.out.println(s1.equalsIgnoreCase(s22));//True

}}