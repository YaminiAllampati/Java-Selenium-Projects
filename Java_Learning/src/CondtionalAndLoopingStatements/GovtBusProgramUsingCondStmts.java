package CondtionalAndLoopingStatements;

import java.util.Scanner;

public class GovtBusProgramUsingCondStmts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the gender(M/F) :");
		char gender = s.next().charAt(0);	
		System.out.println("Enter the age :");
		int age = s.nextInt();	
		
	/*	char gender ='M';
		int age = 3;  */
		if(gender=='M') 
		{
			if(age<2)  
			{
        	 System.out.println("free");
			}
			else if(age>2 && age <=12) 
			{
				System.out.println("Half Ticket");
			}
			else if(age>12 && age <=60) 
			{
				System.out.println("full ticket");
			}
			else 
			{
				System.out.println("Half ticket due to Sr citizen");
			}
         }
		else {
			System.out.println("Free tickt for women");
		}

	}

}
