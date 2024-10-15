/*kisi child class ke constructor se pahale uske parent class ka default constructor phale  chalta hain wo implicititly super 
//keyword laga deta hain .aisa isliye hota hain ki parent class main koi data member ho to intilize ho paye */

class A
{

A()
{//super();

System.out.println("A cons...");
}
}

class B extends A
{

B()
{//super();

System.out.println("B cons...");
}

}

class C1 extends B
{
C1()
{//super();
System.out.println("c cons...");
}

public static void main(String ss[])
{
C1 c=new C1();
}
}