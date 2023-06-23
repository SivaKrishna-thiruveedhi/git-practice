package org.cglia.sample1;

public class PassByReferenceExample {
	   public static void main(String[] args) {
	      MyClass obj = new MyClass();
	      obj.setValue(100);
	      System.out.println("Before calling the method, obj.value = " + obj.getValue());
	      changeValue(obj);
	      System.out.println("After calling the method, obj.value = " + obj.getValue());
	   }
	   
	   public static void changeValue(MyClass obj) {
	      obj.setValue(20);
	      System.out.println("Inside the method, obj.value = " + obj.getValue());
	   }
	}

	class MyClass {
	   private int value;
	   
	   public int getValue() {
	      return value;
	   }
	   
	   public void setValue(int value) {
	      this.value = value;
	   }
	}

