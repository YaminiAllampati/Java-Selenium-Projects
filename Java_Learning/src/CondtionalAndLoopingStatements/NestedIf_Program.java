package CondtionalAndLoopingStatements;

import java.util.Scanner;

public class NestedIf_Program {
	

	public static void main(String[] args) {

			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the gender: ");
			 char gender = sc.next().charAt(0);
			 System.out.println("Enter the age");
				int age = sc.nextInt();
			if(gender=='M') {
				
				if(age<2)  {
	        	 System.out.println("free");
				}
				else if(age>2 && age <=12) {
					System.out.println("Half Ticket");
				}
				else if(age>12 && age <=60) {
					System.out.println("full ticket");
				}
				else {
					System.out.println("Half ticket due to Sr citizen");
				}
	         }
			else {
				System.out.println("Free tickt for women");
			}

		}

	}

		
		