class Test4{
void login(){
System.out.println ("login");
}
boolean register(){
System.out.println("register");
return true;
}
public static void main(String args[]){
Test4 t=new Test4();
t.login();
boolean b =t.register();
System.out.println(b);
}}