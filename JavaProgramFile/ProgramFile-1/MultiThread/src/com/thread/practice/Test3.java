package com.thread.practice;

class SumThread extends Thread {
 private int[] array;
 private int start;
 private int end;
 private long sum = 0;

 public SumThread(int[] array, int start, int end) {
     this.array = array;
     this.start = start;
     this.end = end;
 }

 @Override
 public void run() {
     for (int i = start; i < end; i++) {
         sum += array[i];
     }
 }

 // Getter method to retrieve the partial sum
 public long getSum() {
     return sum;
 }
}

public class Test3 {
 public static void main(String[] args) throws InterruptedException {
     int arraySize = 100000;  
     int[] array = new int[arraySize];
     
     for (int i = 0; i < arraySize; i++) {
         array[i] = i + 1;
     }

     
     SumThread thread1 = new SumThread(array, 0, arraySize / 2);  // Sum first half
     SumThread thread2 = new SumThread(array, arraySize / 2, arraySize);  // Sum second half

     
     thread1.start();
     thread2.start();

     
     thread1.join();
     thread2.join();

     
     long totalSum = thread1.getSum() + thread2.getSum();

     
     System.out.println("Total sum of array elements: " + totalSum);
 }
}
