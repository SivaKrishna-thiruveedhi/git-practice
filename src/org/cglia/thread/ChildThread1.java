package org.cglia.thread;


public class ChildThread1 extends Thread
{ 
	public static void main(String args[])
	{  
		Runnable t=new ChildThread();
		Thread t1 = new Thread(t);
		
		t1.start();  
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main thread is running...");
		}
	}  
}

class ChildThread implements Runnable
{
	public void run()
	{  
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread is running...");  
		}
	}
}