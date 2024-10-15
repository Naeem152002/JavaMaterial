class Test{
public static void main(String args[]){
String s1="surya";
String s2="Surya";
String s3="surya";
String s4="naeem";
System.out.println(s1.equals(s2));//false
System.out.println(s1.equals(s3));//true

System.out.println(s1==s2);//false
System.out.println(s1==s3);

System.out.println(s1.equalsIgnoreCase(s2));//True
System.out.println(s1.equalsIgnoreCase(s4));//false
}}