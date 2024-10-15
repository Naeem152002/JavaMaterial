class MakeString
{

public static void main(String hathi[])
{

char c[]={'j','a','v','a'};

String s1=new String(c);

String s2=new String(s1);

System.out.println(s1);
System.out.println(s2);
System.out.println(s1==s2);
System.out.println(s1.equals(s2));


byte b[]={65,66,67};

String s3=new String(b);

System.out.println(s3);



}
}