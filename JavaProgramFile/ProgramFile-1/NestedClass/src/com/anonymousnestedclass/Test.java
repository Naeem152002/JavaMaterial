package com.anonymousnestedclass;


interface I
{
void show();	
}

public class Test 
{

	public static void main(String[] args) 
	{

//		I i=new I()//main jab kisi class se interface ko implements nahi 
//				//krna chata  hu but use krna chahta hu to main iska use krta hu
//		{
//
//			@Override
//			public void show() {
//				 System.out.println("show");
//			}
//			
//			
//		};
//
//		i.show();
//	}
		
		I i=new I() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
			
		};

}
}