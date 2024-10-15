
interface I
{
void show();	
}

public class Anonymous 
{

	public static void main(String[] args) 
	{

		I i=new I()
		{

			@Override
			public void show() {
				 System.out.println("show");
			}
			
			
		};

		i.show();
	}

}
