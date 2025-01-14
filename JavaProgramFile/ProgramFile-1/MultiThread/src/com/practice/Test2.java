package com.practice;

class MyThread2 extends Thread {
    @Override
    public void run() {
        // This code will be executed by the worker thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker thread is working: Task " + i);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);  // Pause for 1 second between tasks
            } catch (InterruptedException e) {
                System.out.println("Worker thread interrupted");
            }
        }
    }
}

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        // Create and start the worker thread
        MyThread2 workerThread = new MyThread2();
        workerThread.start();
        // Main thread waits for the worker thread to finish
        System.out.println("Main thread waiting for worker thread to finish...");
        workerThread.join();  // Main thread stops here until workerThread completes
       
        System.out.println(Thread.currentThread().getName());// This will be executed after the worker thread finishes
        System.out.println("Worker thread has finished. Main thread resuming.");
    }
}
