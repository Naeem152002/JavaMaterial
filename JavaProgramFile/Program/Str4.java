class Sample
{
public static void main(String aa[])
{
String s="ram"+"shyam";
System.out.println(s);//ramshyam
}
}


//the compiler transform this to:-

//String s=(new StringBuilder().append("ram")).apend("shyam")).toString();
