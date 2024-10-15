class MethodDemo
{

void add()
{
int x=10;
int y=20;
int z=x+y;
System.out.println(z);
}

int sub()
{
int x=100;
int y=20;
int z=x-y;
System.out.println(z);
return z;
}

public static void main(String ss[])
{
MethodDemo r=new MethodDemo();
r.add();
int p=r.sub();
System.out.println(p+1);



}

}