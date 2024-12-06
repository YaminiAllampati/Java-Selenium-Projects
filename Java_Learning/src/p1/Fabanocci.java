package p1;

import java.util.Scanner;

public class Fabanocci {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = s.nextInt();
		System.out.println("Enter b value : ");
		int b = s.nextInt();
		System.out.println("Enter n value : ");


		int n=s.nextInt();
		
		//int a=0;
		//int b=1;
		//int n=4;
        int c;

		//011235813
		
		
		
		for(int i=0; i<=n;i++)
		{
		   c=a+b; //c=1
		    System.out.println("a : " + a);
			System.out.println("b : " +b);
			System.out.println("c : " + c);
			a=b;
			b=c; //1
			 //1
		}
		
		
		
		
		
		
		
		
	
	}

}
