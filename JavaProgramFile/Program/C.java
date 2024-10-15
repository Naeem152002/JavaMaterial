class A
{
//static public final synchronized strictfp void main(String[] args)

public static void main(String ...a) //jdk1.5 VARRGS
{
System.out.println("hello A");
}
}
class B
{
//public static void main(String[] args)
public static void main(String ...s)
{
System.out.println("hello B");
main(23);
}
static int main(int x)
{
System.out.println(x);
return 10;
}
}

class C
{
public static void main(String[] args)
{
//B.main(null);
//B.main(new String[]{"hello"});
//B.main(args);
B.main();
System.out.println("hello C");
}
}