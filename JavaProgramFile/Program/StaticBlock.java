class StaticBlock
{
static int y;

public static void main(String ss[])
{
System.out.println("main...");
}

{
System.out.println("init block1.");
}

{
System.out.println("init block2.");
}

StaticBlock()
{
System.out.println("cons...");
}

StaticBlock(int x)
{
System.out.println(x);
}

StaticBlock
{
System.out.println("static block1.");
new StaticBlock();
new StaticBlock(34);
y=10;
}


static
{
System.out.println("static block2.");
}


static
{
System.exit(0);
System.out.println("static block3.");
}

{
System.out.println("init block3.");
}

}