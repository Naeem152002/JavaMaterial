//Example of interrupting a thread that doesn't stop working
package com.interupt;

class Test1 extends Thread{  
public void run(){  
try{  
Thread.sleep(1000);  
System.out.println("task");  
}catch(InterruptedException e){  
System.out.println("Exception handled "+e);  
}  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Test1 t1=new Test1();  
t1.start();  
  
t1.interrupt();  
  
}  
}  