//Method chaining 
class ThisTest6
{
 
ThisTest6()
{
System.out.println("cons");
}

ThisTest6 disp()
{
System.out.println("disp...");
return this;
}
 
ThisTest6 show()
{
System.out.println("show...");
return this;
}

void m1()
{
System.out.println("m1..");
}
public static void main(String ss[])
{
new ThisTest6().disp().show().m1(); 
}}