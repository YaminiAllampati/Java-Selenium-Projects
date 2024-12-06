package programs;

import java.util.Scanner;

public class Practice1 {
	

	
	Scanner s = new Scanner(System.in);
	System.out.println("c2");
     int a =s.nextInt();

	
	
	
	static void m1()
	{ 
		Practice1 n = new Practice1();
		final int a =12;
		//a=13;
		System.out.println("m1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(n.c);
	}
	void m1(int a)
	{
		System.out.println("m2");
		System.out.println(b);
		System.out.println(c);
	}
	
	private Practice1()
	{
		System.out.println("c1");
	}
	protected Practice1(float a)
	{
		System.out.println("c2");
	}

	public static void main(String[] args) {
		
		m1();
		Practice1 p = new Practice1(1.2f);
		Practice1 p1 = new Practice1();

		p.m1(2);
		System.out.println(p1.c);
		System.out.println(b);
		
		for(int i=0; i<4;i++)
		{
			System.out.println(i);
		} 

	}
}


