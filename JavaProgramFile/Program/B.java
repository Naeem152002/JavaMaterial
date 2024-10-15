class A{
public String getN(){
return "baba";
}
}
class B{
public A getA(){
return new A();
}
public static void main(String args[]){
B b=new B();
System.out.println(b.getA().getN());
}
}