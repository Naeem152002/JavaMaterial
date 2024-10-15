package p2;
import static p1.Temp1.*;
import static java.lang.System.*;
//import static p1.*;//error
import p1.*;
//import java.lang.System.*;
class Temp2
{ 
public static void main (String args[])
{
Temp1 t1=new Temp1();
t1.disp();
 out.println(Temp1.x);
t1.show();
 out.println(x);
out.println(x);
show();

Temp1.show();

}
}