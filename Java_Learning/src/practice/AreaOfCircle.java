package practice;

public class AreaOfCircle {
	
	static double pi = 3.14; //global variable
	static void a1()
	{
		int r = 1; //local variable
		double area = pi*r*r;	
		System.out.println(area);
	}
	void a2()
	{
		int r = 2;
		double area = pi*r*r;
		System.out.println(area);

	}
	static void a3(int r)
	{
		double area = pi*r*r;
		System.out.println(area);

	}
	void a4(int r)
	{	
		double area = pi*r*r;
		System.out.println(area);

	}
	public static void main(String[] args) {
		
	  a1();
	  AreaOfCircle a = new AreaOfCircle();
	  a.a2();
	  a3(9);
	  a.a4(6);
	 
		
		

	}

}
