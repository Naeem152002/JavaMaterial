class MethodDemo2{
void m1(byte b){
System.out.println(b);
}
void m2(short b){
System.out.println(b);
}
void m3(int x){
System.out.println(x);
}
void m4(long l){
System.out.println(l);
}
void m5(float f){
System.out.println(f);
}
void m6(double d){
System.out.println(d);
}
void m7(boolean b){
System.out.println(b);
}
void m8(char c){
System.out.println(c);
}
void m9(float f){
System.out.println(f);
}
void m10(String n,char c,int x,double d){
System.out.println("m10");
}
float m11(boolean b,MethodDemo d){
System.out.println(b);
System.out.println("m11");
return 6.7f;
}
A m12(String s,A a){
System.out.println("m12");
return a;
}
B m13(B b){
System.out.println("m13");
return b;
}
I m14(I i){
System.out.println("m14");
return new SabKuch();
}
I m15(){
System.out.println("m15");
return new SabKuch();
}
KuchBhe m16(KuchBhe b){
System.out.println("m16");
return b;
}




public static void main(String args[]){

MethodDemo2 e=new MethodDemo2();
e.m1((byte)9);
e.m2((short)2);
e.m3(9);
e.m4(9l);
e.m5(9.6f);
e.m6(8.9);
e.m7(true);
e.m8('e');
e.m9(7.8f);
e.m10("gufran",'a',15,8.67);
e.m11(true,new MethodDemo());
e.m12("hathi",new A());
e.m13(new B());
e.m14(new SabKuch());
e.m15();
e.m16(new KuchBhe());
}}
class MethodDemo{
}
class A{
}
class B{
}
interface I{
}
class SabKuch implements I{
}
class KuchBhe{
}
