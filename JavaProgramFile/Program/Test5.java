class Test5{
void login(String email){
System.out.println("login");
}
boolean register(String name,String email){
System.out.println(name);
System.out.println(email);
return true;
}
public static void main(String args[]){
Test5 t=new Test5();
t.login("pr@gmail.com");
boolean
b=t.register("ram","ram@gamil.com");
}}