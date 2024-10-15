//notify
package com.interthreadcommunication;
class Geek11 extends Thread {
    public void run()
    {
        synchronized (this)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
class Geek22 extends Thread {
    Geek11 geeks11;
   
    Geek22(Geek11 geeks11){ 
      this.geeks11 = geeks11; 
    }
   
    public void run()
    {
        synchronized (this.geeks11)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
 
            try {
                this.geeks11.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
class Geek33 extends Thread {
    Geek11 geeks11;
    Geek33(Geek11 geeks11) { this.geeks11 = geeks11; }
    public void run()
    {
        synchronized (this.geeks11)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
            this.geeks11.notify();
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
  class Geek44 extends Thread {
        Geek11 geeks11;
       
        Geek44(Geek11 geeks11){ 
          this.geeks11 = geeks11; 
        }
       
        public void run()
        {
            synchronized (this.geeks11)
            {
                System.out.println(
                    Thread.currentThread().getName()
                    + "...starts");
     
                try {
                    this.geeks11.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(
                    Thread.currentThread().getName()
                    + "...notified");
            }
        }
    }
class Test1 {
    public static void main(String[] args)
        throws InterruptedException
    {
 
        Geek11 geeks11 = new Geek11();
        Geek22 geeks22 = new Geek22(geeks11);
        Geek33 geeks33 = new Geek33(geeks11);
        Geek44 geeks44 = new Geek44(geeks11);
        Thread t1 = new Thread(geeks11, "Thread-1");
        Thread t2 = new Thread(geeks22, "Thread-2");
        Thread t3 = new Thread(geeks33, "Thread-3");
        Thread t4 = new Thread(geeks44, "Thread-4");
        t1.start();
        t2.start();
        t4.start();
        Thread.sleep(100);
        t3.start();
    }
}
