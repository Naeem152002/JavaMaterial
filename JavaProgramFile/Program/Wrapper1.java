class Wrapper1 
{
 
public static void main(String hathi[])
{
 
int x=10;
System.out.println(x);
Integer i=new Integer(x); //boxing...
System.out.println(i);
int p=i.intValue(); //unboxing...
System.out.println(p);



int y=10;
System.out.println(y);
Integer i1=x; //auto boxing.. jdk1.5
System.out.println(i1);
int p1=i1;
System.out.println(p1);
}

  

}




}}

  