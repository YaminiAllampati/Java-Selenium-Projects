package CondtionalAndLoopingStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Press 1 for to open chrome : ");
		System.out.println("Press 2 for to open edge : ");
		System.out.println("Press 3 for to open firefox : ");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
		int i = sc.nextInt();
		switch(i)
		{
		case 1 : System.out.println("Chrome");
		         break;
		case 2 : System.err.println("Edge");
		         break;
		case 3 : System.out.println("Firefox");
		         break;
		default : System.out.println("Anyother browser");
		}

	}

}
