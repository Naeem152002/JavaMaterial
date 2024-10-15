class Test{
Test(){
System.out.println("constructor");
}
Test(int x){
System.out.println(x);
}
Test(int x,int y){
System.out.println(x);
System.out.println(y);

}
Test(int x,int y, int z){
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
public static void main(String []args){
new Test();
new Test(4);
new Test(7,8);

new Test(45,89,78);
}
}
