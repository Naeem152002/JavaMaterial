class AtmServer{
void sum(){
int x=10;
int y=20;
int z=x+y;
System.out.println(z);
}
int mul(){
int x=10;
int y=20;
int z=x*y;
System.out.println(z);
return 10;
}
void sub(int r,int t){
int x=10;
int y=20;
int z=x-y;
System.out.println(z);
}
float div(int r,int t){
int x=20;
int y=10;
int z=x/y;
System.out.println(z);
return 63.7f;
}}
class Atm{
public static void main(String args[]){
AtmServer a=new AtmServer();
a.sum();
a.mul();
int x=a.mul();
System.out.println(x);
}
}
