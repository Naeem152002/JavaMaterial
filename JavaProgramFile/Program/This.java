class This{
int x=10;
void show (){
int x=20;
System.out.println(x);
System.out.println(this.x);

}
public static void main(String args[]){
This t=new This();
System.out.println(t);
t.show();}}