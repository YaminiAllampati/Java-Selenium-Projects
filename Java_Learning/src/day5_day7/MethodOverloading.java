package day5_day7;

public class MethodOverloading {
	
	/* java will accept the duplicate method name, to overcome this, we will go with method overloading
	 * overloading means, method name will be same with variation of arguments passing.
	 * arguments should not be same in the methods
	 * add - is the same method with diff arguments irrespective of static & non-static
	 */
	
	//static method
	static void add()
	{
	  int a=1, b=2;
		System.out.println("method1 :" + (a+b));
	}
	static void add(int a, int b)
	{
		System.out.println("method2 :" + (a+b));
	}
	static void add(float a, int b)
	{
		System.out.println("method3 :" + (a+b));
	}
	//non-static
	
	 void add(int a, double b)
	{
		System.out.println("method4 :" + (a+b));
	}
	void  add(double a, int b, float c) 
	{
		System.out.println("method5 :" + (a+b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(1,2);
		add(1.234f,23);
		MethodOverloading m1= new MethodOverloading();
		m1.add(1, 2.34678);
		m1.add(1.3223323, 12, 1.232f);

	}

}
