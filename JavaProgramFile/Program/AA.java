class B
{
	}

public class AA extends B {

public int x=10;
	
	public void show()
	{}
	
	AA()
	{}
	
    public static void main( String[] args )
    {
    	AA a=new AA();
    	System.out.println(a.getClass().getName());
    
    	Class c=a.getClass();
    	System.out.println(c);
    	
    	System.out.println(c.getName());
    	System.out.println(c.getSuperclass());
    	 
    	

    
    }

	
}
