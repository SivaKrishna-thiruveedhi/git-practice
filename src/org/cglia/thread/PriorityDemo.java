package org.cglia.thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");   
        t1.setPriority(Thread.MAX_PRIORITY);	     // Set the priority of t1 to be higher than t2
        t2.setPriority(Thread.MIN_PRIORITY);       
        t1.start();									// Start the threads
        t2.start();
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName() + ", priority: " + Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
