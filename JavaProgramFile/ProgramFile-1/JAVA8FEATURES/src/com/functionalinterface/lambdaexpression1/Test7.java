package com.functionalinterface.lambdaexpression1;


public class Test7 
{	 
	public static void main(String[] args) {
		 

      Thread thread=new Thread(()->{
    	  for (int i = 0; i < 10; i++) {
    		  System.out.println(i);
  			
    		  //System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	  
    	  
      });
      thread.start();
	
	}

	
}

