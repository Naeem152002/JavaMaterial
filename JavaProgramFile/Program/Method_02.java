class Method_02{

void m1(byte b)
{
System.out.println(b);
  }


void m2(short s){
System.out.println(s);
}

void m3(int i){
System.out.println(i);
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

void m7(char c){
System.out.println(c);

}

void m8(boolean B){
System.out.println(B);

}

public static void main(String args[])
{
Method_02 m = new Method_02();
m.m1((byte)10);
m.m2((short)20);
m.m3(30);
m.m4(40l);
m.m5(7.8f);
m.m6(9.8);
m.m7('B');
m.m8(true);


}
}