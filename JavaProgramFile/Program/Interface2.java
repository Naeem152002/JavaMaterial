interface My//implicitly absract
{                                
int i=10;//imlicit public static final            
void show();//implicit public absrtact
void display();
} 
class Child implements My
{
public void show()
{
System.out.println("show");
}
public void display()
{
System.out.println("display");
}
public static void main(String a[])
{
My m=new Child();
m.show();
m.display();
/*Child c=new Child();
c.show();
c.display();
*/
System.out.println(My.i);
System.out.println(Child.i);

}}