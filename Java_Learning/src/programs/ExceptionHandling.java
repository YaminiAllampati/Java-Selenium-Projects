package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		//int a =1/0;
		int b=12;
		try {
			
			Scanner s = new Scanner(System.in);
			 System.out.println("Enter the a value");
			         int a =s.nextInt();
			         System.out.println("ouput : "  + a);
		}
		catch(NullPointerException e1)
		{
			System.out.println("valiate error1");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("valiate error2");
		}
		catch(InputMismatchException e3)
		{
			System.out.println("valiadte error 3");
		}
	    
		
		System.out.println(b);
	}

}
