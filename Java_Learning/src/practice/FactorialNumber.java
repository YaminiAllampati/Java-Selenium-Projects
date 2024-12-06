package practice;

public class FactorialNumber {
	
	int fact = 1;
	
    void factorial(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber f = new FactorialNumber();
		f.factorial(5);
				
		
	}

}
