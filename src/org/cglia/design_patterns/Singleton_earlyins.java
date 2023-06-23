package org.cglia.design_patterns;

class SingletonExample {
	private static SingletonExample instance = new SingletonExample();
    // Private constructor to prevent instantiation from other classes
    private SingletonExample() {
        // Initialization code
    }
    // Public static method to get the singleton instance
    public static SingletonExample getInstance() {
        return instance;
    }
    public void sum(int m, int n) {
    	System.out.println("The sum is : "+(m+n));
    }
}

public class Singleton_earlyins {
	public static void main(String[] args) {
//		SingletonExample s1 = new SingletonExample();
		SingletonExample s = SingletonExample.getInstance();	// gives the instance.
		s.sum(45, 55);
	}
}
