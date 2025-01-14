package com.interthreadcommunication;

class PrintTable {
    // Synchronized method to print the multiplication table
    public synchronized void table(int x) {
        for (int i = 1; i <= 6; i++) {
            try {
                Thread.sleep(1000);  // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + (x * i));
        }
    }
}

class D extends Thread {
    PrintTable t;

    D(PrintTable t) {
        this.t = t;
    }

    @Override
    public void run() {
        synchronized (t) {
            t.table(2); // Print table of 2
            t.notifyAll(); // Notify Thread E after finishing
        }
    }
}

class E extends Thread {
    PrintTable t;

    E(PrintTable t) {
        this.t = t;
    }

    @Override
    public void run() {
        synchronized (t) {
            try {
                t.wait();  // Wait for notification from Thread D
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.table(4);  // Print table of 4 after being notified
        }
    }
}

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        PrintTable t = new PrintTable();

        Thread t1 = new Thread(new D(t), "Thread D");
        Thread t2 = new Thread(new E(t), "Thread E");
        t2.start();
        t1.start();
    }
}
