//Example of interrupting thread that behaves normally
package com.interupt;

class Test2 extends Thread{  
	  
public void run(){  
for(int i=1;i<=5;i++)  
System.out.println(i);  
}  
  
public static void main(String args[]){  
Test2 t1=new Test2();  
t1.start();  
  
t1.interrupt();  
  
}  
}  
