
// public 
final class A
{

static A a;

private A()
{

}

synchronized public static A getAObj()//multithereading ke liye 
{
if(a==null)
{
a=new A();
return a;
} 
else
{
return a;
}

}
}

class B
{
public static void main(String ss[])
{
A a1=A.getAObj();
A a2=A.getAObj();
System.out.println(a1);
System.out.println(a2);
}

}


