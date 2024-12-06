package p1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		//int n=11;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = s.nextInt();
		int c=0;
	    for(int i=1; i<=n;i++)
	    {
	    	if(n%i==0)
	    	{
	    		c++;
	    	}
	    }
	    if(c==2)
	    {
	    	System.out.println("Prime Number");
	    }
	    else
	    {
	    	System.out.println("Not a Prime Number");

	    }
	}

}
