class TypePro{
/*void show(byte b)
{
System.out.println("byte="+b);
}*/

void show(short b)
{
System.out.println("short="+b);
}
 
void show(int b)
{
System.out.println("int="+b);
}

void show(float b)
{
System.out.println("float="+b);
}


void show(double b)
{
System.out.println("double="+b);
}


void show(long b)
{
System.out.println("long="+b);
}
 
public static void main(String ss[])
{
   TypePro t=new TypePro();
  // t.show(10l);
t.show((byte)7);
}
}