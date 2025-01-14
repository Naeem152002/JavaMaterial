package com.interthreadcommunication;

class Table {
    public synchronized void printTable(int x) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);  // Reduced sleep for faster testing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + x * i);
        }
    }
}

class P implements Runnable {
    Table t;

    P(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        synchronized (t) {
            t.printTable(2);  // Print table of 2
            t.notify();  // Notify other threads waiting on the table object
        }
    }
}

class Q implements Runnable {
    Table t;

    Q(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        synchronized (t) {
            try {
                t.wait();  // Wait for notification from Thread P
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.printTable(4);  // Print table of 4 after being notified
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Table t = new Table();  // Shared object

        // Create threads for P and Q
        Thread t1 = new Thread(new P(t), "First Thread");
        Thread t2 = new Thread(new Q(t), "Second Thread");

        // Start both threads
        t2.start();  // Start Thread Q first, so it can enter the wait state
//        try {
//            Thread.sleep(100);  // Give time for Thread Q to wait
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t1.start();  // Start Thread P after Thread Q has started waiting
    }
}
