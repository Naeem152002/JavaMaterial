class ThisTest5
{
 ThisTest5 disp()
{
System.out.println("disp...");
return new ThisTest5();
}
 
ThisTest5 show()
{
System.out.println("show...");
return new ThisTest5();
}

ThisTest5 m1()
{
System.out.println("m1..");
return new ThisTest5();
}
public static void main(String ss[])
{
 new ThisTest5().disp().show().m1();
 
}

}