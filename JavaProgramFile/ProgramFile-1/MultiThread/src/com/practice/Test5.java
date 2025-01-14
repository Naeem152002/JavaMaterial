package com.practice;

class Task extends Thread{
    private final String taskName;

    Task(String name, int priority) {
        super(name);
        setPriority(priority);
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(taskName + " is running with priority " + getPriority());
            try {
                // Simulate work by sleeping
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        Task highPriorityTask = new Task("High-Priority-Task", Thread.MAX_PRIORITY);
        Task normalPriorityTask = new Task("Normal-Priority-Task", Thread.NORM_PRIORITY);
        Task lowPriorityTask = new Task("Low-Priority-Task", Thread.MIN_PRIORITY);

        // Start threads
        lowPriorityTask.start();
        normalPriorityTask.start();
        highPriorityTask.start();
    }
}
