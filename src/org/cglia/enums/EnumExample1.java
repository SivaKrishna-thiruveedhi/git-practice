package org.cglia.enums;

public class EnumExample1 {
	
	enum Laptop
	{
		ACER(25000),
		DELL(30000),
		ASUS(22000),
		LENOVO(24000);
		
		int price;
		Laptop(int price)
		{
			this.price=price;
		}
	}
	
	public static void main(String[] args) {
		for(Laptop l : Laptop.values())
		{
			System.out.println(l+" Laptop costs "+l.price);
		}
	}

}
