class A
{
static B getObj()
{
return new B();
}
}
class B
{
void show()
{
System.out.println("show");
}} 
class Test
{
public static void main(String ss[])
{
java.io.Console c=System.console();
B b =A.getObj(); 
b.show(); 
}
}