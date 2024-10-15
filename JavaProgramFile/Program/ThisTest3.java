class ThisTest3
{
 
ThisTest3()
{
System.out.println("cons");
}

ThisTest3 disp()
{
System.out.println("disp...");
return this;
}
 
ThisTest3 show()
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
new ThisTest3().disp().show().m1(); 
}
}