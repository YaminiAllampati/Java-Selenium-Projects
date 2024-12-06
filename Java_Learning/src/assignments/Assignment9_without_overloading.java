package assignments;

public class Assignment9_without_overloading {
	
	static void output1(int a)
	{
		System.out.println("sm1 :" + a);
	}
	static void output2(int a, int b)
	{
		int sum = a+b;
		System.out.println("sm2 :"+ sum);
	}
	static void output3(int a, double b) 
	{
		double sub = a-b;
		System.out.println("sm3 :" + sub);
	}
	
	void output4(float a)
	{
		System.out.println("nsm1 :" + a);
	}
	void output5(float a, int b)
	{
		System.out.println("nsm2 :" +a*b);
	}
	void output6(char a)
	{
		System.out.println("nsm3 :" +a);
	}
	
	Assignment9_without_overloading()
	{
		System.out.println("cons1");
	}
	Assignment9_without_overloading(int a, int b)
	{
		System.out.println("cons2 :" + (a/b ));
	}
	Assignment9_without_overloading(int a, double b)
	{
		System.out.println("cons3 :" + (a+b));
	}
	
	public static void main(String[] args) 
	{
		
		output1(1);
		output2(2,3);
		output3(2,4.787);
		Assignment9_without_overloading a1 = new Assignment9_without_overloading();
		a1.output4(1.234f);
		a1.output5(1.23f, 3);
		a1.output6('a');
	    new Assignment9_without_overloading(2,1);
		new Assignment9_without_overloading(3,7.8976);
	

		
	}

}



