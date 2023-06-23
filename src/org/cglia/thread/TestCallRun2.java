package org.cglia.thread;

public class TestCallRun2 extends Thread{  
	 public void run(){  
		 for(int i=1;i<5;i++){  
			 System.out.println(i);
			 try{
				 Thread.sleep(100);
			 }
			 catch(InterruptedException e){
				 System.out.println(e);
			 }			   
		 }  
	 }  
	 public static void main(String args[])
	 {  
		 TestCallRun2 t1=new TestCallRun2();  
		 TestCallRun2 t2=new TestCallRun2();
		 t1.start();  
		 t2.start();
	 }  
}