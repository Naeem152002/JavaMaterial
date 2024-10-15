package com.practice;
class MyThread extends Thread {
    @Override
    public void run() {
        // This code will be executed in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread is working: Task " + i);
            try {
                Thread.sleep(1000);  // Pause for 1 second between tasks
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

public class MainThreadExample {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();

        // Main thread doing its own task
        System.out.println("Main thread is doing something else...");
    }
}
