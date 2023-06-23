package org.cglia.sample1;

interface Sample2
{
	void display();
}
interface Sample3
{
	void display2();
}

public class SampleProgram_1_On_InterfaceSegrigation implements Sample2
{
	public void display()
	{
		System.out.println("Sample2 Class method executed..........");
	}
	public static void main(String[] args) {
		
		Sample3 s1 = new Sample4();
		s1.display2();
		
		Sample2 s = new SampleProgram_1_On_InterfaceSegrigation();
		s.display();
	}
}

class Sample4 implements Sample3
{
	@Override
	public void display2() {
		System.out.println("Sample4 class method executed .......");
	}
}
