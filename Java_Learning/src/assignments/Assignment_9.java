package assignments;

public class Assignment_9 {
       //Assignment 9
	//WAP in which there are 3 static methods,3 nonstatic methods & 3 constructors.. 
	//3 static methods can be parameterized? 3 non-static methods can be parameterized? 3 Constructors can be parameterized?
	
	//static method with parameterized
	static void output(int a)
	{
		System.out.println("sm1 :" + a);
	}
	static void output(int a, int b)
	{
		int sum = a+b;
		System.out.println("sm2 :"+ sum);
	}
	static void output(int a, double b) 
	{
		double sub = a-b;
		System.out.println("sm3 :" + sub);
	}
	//Non-static method with parameterized
	
	void output(float a)
	{
		System.out.println("nsm1 :" + a);
	}
	void output(float a, int b)
	{
		System.out.println("nsm2 :" +a*b);
	}
	void output(char a)
	{
		System.out.println("nsm2 :" +a);
	}
	
	//Constructor with  parameterized & non-paramerterized
	
	Assignment_9(){
		System.out.println("cons1");
	}
	Assignment_9(int a, int b)
	{
		System.out.println("cons2 :" + a*b );
	}
	Assignment_9(int a, double b)
	{
		System.out.println("cons3 :" + (a+b));
	}
	
	public static void main(String[] args) 
	{
		
		output(1);
		output(2,3);
		output(2,4.787);
		Assignment_9 a1 = new Assignment_9();
		a1.output(1.234f);
		a1.output(1.23f, 3);
		a1.output('a');
		Assignment_9 a2 = new Assignment_9(1,2);//calling constructor type -1
	    new Assignment_9(1,2.34323);//calling constructor type -2

		
	}

}
