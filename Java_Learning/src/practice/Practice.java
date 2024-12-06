package practice;

public class Practice {
	void m2()
	{
		System.out.println("test");
	}
	
	void m1(int a)
	{
		System.out.println(a);
	}
	Practice(int a)
	{
		System.out.println(a);
	}
	Practice()
	{
		
		System.out.println("Test1");
	}

	public static void main(String[] args) {
		
	//	System.out.println(z);
		Practice p = new Practice(1);
		p.m1(2);
		p.m2();
		Practice p3 = new Practice();
		p3.m2();
		p3.m1(2);
		Practice p2 = new Practice();
		p2.m2();

		
		
	}

}
