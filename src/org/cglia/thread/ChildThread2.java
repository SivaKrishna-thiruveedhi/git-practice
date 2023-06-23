package org.cglia.thread;

public class ChildThread2 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread is running.....");
	}
	
	public static void main(String[] args) {
		ChildThread2 c2 = new ChildThread2();
		
		// using Thread(Runnable r) constructor
		
		Thread t1 = new Thread(c2);
		t1.start();
	}
}
