package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interf {
	 
	 public static void main(String[] args) {
		 
		 try {
			 
			// int a = 1/0;
			 
			// Scanner s = new Scanner(System.in);
			// System.out.println("Enter name:");

			 String s1 = null;
			
			 //s1.length();			 
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println("error");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("error1");
		 }
		 catch(InputMismatchException e)
		 {
			 System.out.println("error2");
		 }
		 finally 
		 {
			 System.out.println("last");
		 }

	 }
	 
	 }
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /* if(1==2)
		 {
		 throw new InputMismatchException("message");
		 }
		 else 
		 {
			 throw new NullPointerException("message1");

		 }
 }
	 } */
