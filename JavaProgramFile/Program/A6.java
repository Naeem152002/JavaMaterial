//Marker interface :- jiske pass ek bhi method na ho marker interface  
interface I
{


}
class B
{

}

class A extends B implements I
{
public static void main(String[] args) {
{
A a=new A();

System.out.println(a instanceof A);
System.out.println(a instanceof B);
System.out.println(a instanceof I);

}
}
}