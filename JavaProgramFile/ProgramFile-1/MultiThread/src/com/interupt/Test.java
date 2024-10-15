//Example of interrupting a thread that stops working

package com.interupt;

public class Test extends Thread { 
    public void run() 
    { 
        try { 
            Thread.sleep(2000); 
            System.out.println("Geeksforgeeks"); 
        } 
        catch (InterruptedException e) { 
            throw new RuntimeException("Thread " + 
                                    "interrupted"); 
        } 
    } 
    public static void main(String args[]) 
    { 
        Test t1 = new Test(); 
        t1.start(); 
        try { 
            t1.interrupt(); 
        } 
        catch (Exception e) { 
            System.out.println("Exception handled"); 
        } 
    } 
}