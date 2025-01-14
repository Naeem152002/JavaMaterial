package com.practice;
class MyThread1 extends Thread {
    @Override
    public void run() {
        // This code will be executed in a separate thread
        for (int i = 1; i <= 5; i++) {
            //System.out.println("MyThread is working: Task " + i);
           System.out.println(Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);  // Pause for 1 second between tasks
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
    	System.out.println(Thread.currentThread().getName());
        // Create an instance of MyThread
        MyThread1 myThread = new MyThread1();
        MyThread1 myThread1 = new MyThread1();
        myThread.join();
        myThread.setPriority(6);
        myThread1.setPriority(7);
        // Start the thread
        myThread.start();
        myThread1.start();
       
        // Main thread doing its own task
        System.out.println("Main thread is doing something else...");
    }
}
