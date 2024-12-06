package CondtionalAndLoopingStatements;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		//Write a Java program that takes a number from the user and 
		//generates an integer between 1 and 7. It displays the weekday name.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value ");
		float a = sc.nextFloat(); /*Input floating-point number: 25.586
		Input floating-point another number: 25.589
		Expected Output :
		They are different */
		System.out.println("Enter the first value ");
		float b = sc.nextFloat();
		
		if(a==b) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("They are diff");
		}
		
		
		/*int n = sc.nextInt();
		 if(n>=1 && n<=7) {
			if(n==1) {
				System.out.println("Monday");
			}
			else if(n==2) {
				System.out.println("Tuesday");
			}
			else if(n==3) {
				System.out.println("Wednesday");
			}
		}
		else {
			System.out.println("No day");
		}
		*/
	}

}
