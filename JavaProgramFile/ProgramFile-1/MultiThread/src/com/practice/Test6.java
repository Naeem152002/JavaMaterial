package com.practice;

class My extends Thread{
    My(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(1000);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

public class Test6{
    public static void main(String[] args) throws InterruptedException {
        // Create two additional threads
        My t1 = new My("Thread-1");
        My t2 = new My("Thread-2");

        // Start the threads
        t1.start();
        t2.start();

        // Main thread waits for t1 and t2 to finish
        t1.join();
        t2.join();

        // Now the main thread executes this part after t1 and t2 are done
        System.out.println("Main thread is running after other threads finished.");
    }
}
