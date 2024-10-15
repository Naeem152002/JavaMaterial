class Test8{
// Parametrized without return method
void enter(){
System.out.println("enter");
}
void login(){
System.out.println("login");
}
// Parametrized with return method
byte add(){
byte x=10;
byte y=20;
byte b=(byte)(x+y);
return b;
}
short sub(){
short x=20;
short y=10;
short s=(short)(x-y);
return s;
}
int mul(){
int x=10;
int y=10;
int z=x*y;
return z;
}
long div(){
long x=20;
long y=30;
long c=x/y;
return c;
}
float read(){
float f1=10f;
return f1;

}
double write(){
double d =5.6d;
return d;
}
boolean hellow(){
System.out.println("hellow");
return false;
}
char hi(){
System.out.println("hie");
return 'O';
}
String name(){
System.out.println("Naeem");
return "naeem";
}

public static void main(String args[]){

Test8 t=new Test8();
t.enter();
t.login();
byte b=t.add();
System.out.println(b);
short s=t.sub();
System.out.println(s);
int i=t.mul();
System.out.println(i);
long l=t.div();
System.out.println(l);
float f=t.read();
System.out.println(f);
double d=t.write();
System.out.println(d);
boolean b1=t.hellow();
System.out.println(b1);
char c=t.hi();
System.out.println(c);
String s1=t.name();
System.out.println(s1);





}
}