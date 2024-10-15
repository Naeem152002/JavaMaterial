class ConOverload{
ConOverload(){
System.out.println("constructor");
}
ConOverload(int x){
System.out.println(x);
}
ConOverload(int x,int y){
System.out.println(x);
System.out.println(y);

}
ConOverload(int x,int y, int z){
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
public static void main(String []args){
new ConOverload();
new ConOverload(4);
new ConOverload(7,8);

new ConOverload(45,89,78);
}
}
