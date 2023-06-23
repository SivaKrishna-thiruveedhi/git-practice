package org.cglia.sample1;

public class PassByValueExample {
	   public static void main(String[] args) {
	      int x = 10;
	      System.out.println("Before calling the method, x = " + x);
	      increment(x);
	      System.out.println("After calling the method, x = " + x);
	   }
	   
	   public static void increment(int num) {
	      num++;
	      System.out.println("Inside the method, num = " + num);
	   }
	}
