

 
public class Anonymous1
{

	public static void main(String[] args) 
	{
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				 System.out.println("show");
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}
}
