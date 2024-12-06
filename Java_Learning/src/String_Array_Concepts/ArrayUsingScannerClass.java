package String_Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		System.out.println("Enter the array:");
		Scanner s = new Scanner(System.in);
		//System.out.println("A1");
		//a[0] = s.nextInt();
		//
		System.out.println("A2");
		//a[1] = s.nextInt();
		int sum=0;
		for(int i=0; i<=3; i++)
		{

			a[i] = s.nextInt();
			sum = sum+a[i];
			System.out.println(sum);

		 }
		

		
		
		
		

	}

}
