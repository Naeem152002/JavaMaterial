class StringMethod1{
public static void main(String args[]){
StringMethod1 m=new StringMethod1();
System.out.println(m);
int i=m.hashCode();
System.out.println(i);//
String hexString= Integer.toHexString(i);
System.out.println(hexString);
Class c=m.getClass();
String name=c.getName();
System.out.println(name);
System.out.println(name+'@'+hexString);

}
}