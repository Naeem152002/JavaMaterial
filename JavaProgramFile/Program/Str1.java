class Test{
public static void main(String args[]){
String s1=new String("surya");
String s2=new String("Surya");
String s3=new String("surya");
String s4=new String("naeem");
System.out.println(s1.equals(s2));//false
System.out.println(s1.equals(s3));//true

System.out.println(s1==s2);//false
System.out.println(s1==s3);//false

System.out.println(s1.equalsIgnoreCase(s2));//True
System.out.println(s1.equalsIgnoreCase(s4));//false
}}