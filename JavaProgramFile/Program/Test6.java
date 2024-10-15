class Test6
{
void add(){
int x=10;
int y=30;
int z=x+y;
System.out.println("Sum="+z);
}
int sub(){
int x=100;
int y=20;
return(x-y);
}
void mul(int x,int y){
int z=x*y;
System.out.println("Mul="+z);
}
int div(int x,int y){
int z=x/y;
return z;
}
public static void main(String args[]){
Test6 t=new Test6();
t.add();
int r=t.sub();
System.out.println(r);
t.mul(2,200);
int h=t.div(20,4);
System.out.println(h);
}
}