
public class A
{
 
int x=10;
static int y=20; 

A()
{
System.out.println(y);
System.out.println(x);
}
void show()
{
System.out.println(x); 
System.out.println(y);

}

public static void main(String ss[])
{
//NSDM
System.out.println(new A().x); 
A4 a=new A4();
System.out.println(a.x); 
a.show();

//SDM

System.out.println(new A4().y); 
System.out.println(a.y);
System.out.println(A.y);
System.out.println(y);


  

}
}

class B
{
public static void main(String ss[])
{
System.out.println(new A().x); 
A a=new A();
System.out.println(a.x); 

System.out.println(new A().y); 
System.out.println(a.y);
System.out.println(A.y);

}

}