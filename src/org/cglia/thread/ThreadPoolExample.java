package org.cglia.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with a fixed size of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);
        // Submit 10 tasks to the thread pool
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor.submit(new Runnable() {
                @Override
                synchronized public void run() {
                    System.out.println("Task #" +taskId+" is running on thread "
                    		+"" +Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000); // Simulate some work being done
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task #" + taskId + " has completed");
                }
            });
        }
        // Shutdown the thread pool when finished
        executor.shutdown();
    }
}
