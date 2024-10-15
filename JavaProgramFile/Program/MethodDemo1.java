class MethodDemo1
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

void mul(int x,int y)
{
int z=x*y;
System.out.println(z);
}

int div(int x,int y)
{
return x/y;
}




public static void main(String ss[])
{
MethodDemo1 r=new MethodDemo1();
r.add();
int p=r.sub();
System.out.println(p+1);
r.mul(12,34);
System.out.println(r.div(20,2));

}

}