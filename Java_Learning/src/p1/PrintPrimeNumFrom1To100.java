package p1;

public class PrintPrimeNumFrom1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		//int c=0;
		for(int i=1;i<=n;i++)
		{
			int c=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			
		if(c==2)
		{
			System.out.println(i + " prime number ");
		}
		else
		{
			System.out.println(i + " not prime number ");

		}
		}

	}

}
