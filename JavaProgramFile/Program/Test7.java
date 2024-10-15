class Test7{
// NonParametrized without return method
void enter(int x){
System.out.println("enter");
}
void login(int y){
System.out.println("login");
}
// NonParametrized with return method
byte add(byte j){
byte x=10;
byte y=20;
byte b=(byte)(x+y);
return b;
}
short sub(short l){
short x=20;
short y=10;
short s=(short)(x-y);
return s;
}
int mul(int u){
int x=10;
int y=10;
int z=x*y;
return z;
}
long div(long w){
long x=20;
long y=30;
long c=x/y;
return c;
}
float read(float x){
float f1=10f;
return f1;

}
double write(double y){
double d =5.6d;
return d;
}
boolean hellow(boolean r){
System.out.println("hellow");
return false;
}
char hi(char c){
System.out.println("hie");
return 'O';
}
String name(String p){
System.out.println("Naeem");
return "naeem";
}

public static void main(String args[]){

Test7 t=new Test7();
t.enter(4);
t.login(8);
byte b=t.add((byte)6);
System.out.println(b);
short s=t.sub((short)8);
System.out.println(s);
int i=t.mul(9);
System.out.println(i);
long l=t.div(10);
System.out.println(l);
float f=t.read(2f);
System.out.println(f);
double d=t.write(7.8d);
System.out.println(d);
boolean b1=t.hellow(true);
System.out.println(b1);
char c=t.hi('v');
System.out.println(c);
String s1=t.name("sahid");
System.out.println(s1);





}
}