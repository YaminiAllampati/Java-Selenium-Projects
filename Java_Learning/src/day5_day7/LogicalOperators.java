package day5_day7;

public class LogicalOperators {
	
	void output(int a, int b) 
	{
		if(a>=2 && b!=20)
		{
			System.out.println("Hi");
		}
		else if((a==1) ||(b==3))
		{
			System.out.println("Hello");
	    }
		else if(!(a==2))
		{
			System.out.println("Namasthey");
		}
	}

	public static void main(String[] args) {
	
		LogicalOperators lo = new LogicalOperators();
		lo.output(7, 20);
	}

}
