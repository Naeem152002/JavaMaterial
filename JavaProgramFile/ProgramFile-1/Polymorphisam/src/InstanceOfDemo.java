 class BB{
	 
 }
public class InstanceOfDemo extends BB {
	public static void main(String args []) {
		
InstanceOfDemo d=new InstanceOfDemo();
InstanceOfDemo d1=null;
System.out.println(d1  instanceof InstanceOfDemo );
System.out.println(d  instanceof BB );
BB b=new BB();
System.out.println(b  instanceof BB );
System.out.println(b instanceof InstanceOfDemo );
BB b1=new InstanceOfDemo();
System.out.println(b1  instanceof BB );
System.out.println(b1  instanceof InstanceOfDemo );

}
}