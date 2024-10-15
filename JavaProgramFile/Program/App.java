
 
public class App 
{
	public int x=10;
	
	public void show()
	{}
	
	App()
	{}
	
    public static void main( String[] args )
    {
    	App a=new App();
    	Class c=a.getClass();
		System.out.println(a.getClass());

    	Class c1=App.class;
    	
    	
    	Class c2=Double.TYPE;
    	
    	
    
    }
}
