class StringMethod{
public String toString(){
return getClass().getName() + "How are You" + Integer.toHexString(hashCode());
}
public static void main(String args[]){
StringMethod m=new StringMethod();
System.out.println(m);
}
}