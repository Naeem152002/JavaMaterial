class Outer
{
static int y=20;
static class Inner
{
static void show()
{
System.out.println(y);
}
}
}
class Temp extends Outer.Inner
{
public static void main(String a[])
{
new Temp().show();
}
}