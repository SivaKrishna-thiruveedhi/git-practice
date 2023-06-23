package org.cglia.thread;
class Print{
	void printDoc(int times, String name){
		synchronized (this) {
			for(int i=1;i<=times;i++){
				System.out.println(name+"'s document....");
			}
		}
	}
}
class ChildThread3 extends Thread {
	Print print;
	ChildThread3(Print p){
		print = p;
	}
	@Override
	public void run() {
		print.printDoc(5, "Siva");
	}
}
class ChildThread4 extends Thread {
	Print print;
	ChildThread4(Print p) {
		print = p;
	}
	@Override
	public void run() {
		print.printDoc(5, "Krishna");
	}
}
public class ThreadSyncronizeExample {
	public static void main(String[] args) {
		Print p1 = new Print();
		ChildThread4 c1 = new ChildThread4(p1);
		ChildThread3 c = new ChildThread3(p1);
		c.start();
		c1.start();
	}
}
