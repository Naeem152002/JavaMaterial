interface I1{
void m1();
void m2();
}
interface I2{
void m3();
void m4();
}
class Inter implements I1,I2{
public void m1(){
}
public void m2(){
}
public void m3(){
}
public void m4(){
}
public static void main(String args[]){
I1 refI1=new Inter();
refI1.m1();
//refI1.m3();
try{
refI1.wait();
refI1.notify();
}
catch(Exception e){
}}}