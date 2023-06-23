package org.cglia.enums;

enum Mobile{
	REALME(3500,4),
	MOTTO(2000,3),
	APPLE(4000,8);
	int price,ram;
	Mobile(int p, int ram)
	{
		this.price = p;
		this.ram = ram;
	}
}
public class EnumExample {
	public static void main(String[] args) {
		for(Mobile m1 : Mobile.values())
		{
			System.out.println(m1+"("+m1.price+")------->>  "+m1.ordinal());
		}
		System.out.println("\n**********************\n");
		// Storing in Array
		Mobile [] m = Mobile.values();
		System.out.println(m[2]+" with price "+m[2].price+" along with ram "+m[2].ram);
	}
}
