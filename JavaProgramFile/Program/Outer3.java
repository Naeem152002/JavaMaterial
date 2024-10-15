class Outer3
{
public void show()
{
//final int l=1;
int l=1;//must be final b/s locals nested class only access final variable of inclosing scope but jdk 8 se rule change ho gay final na lagao tab bhi chal jayega .
class In
{
int i=10;
public void disp()
{
System.out.println("disp.."+(i+l));
}
}
System.out.println(l);
In obj=new In();
obj.disp();
}

public static void main(String aa[])
{
Outer3 o=new Outer3();
o.show();
}
}