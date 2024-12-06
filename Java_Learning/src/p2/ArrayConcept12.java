package p2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept12 {
	
	

	public static void main(String[] args) {
		
		//arrays are equal
		int a[] = new int[] {3,4,6,7};
		int b[] = new int[] {3,4,8,7};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		boolean b1 = Arrays.equals(a, b);
		if(b1==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}


		
		
		//Array by using scanner class
		
		/*	int a1[] = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array value : ");
		
		for(int i=0; i<a1.length;i++)
		{
	        a1[i] = s.nextInt();
		}
		for(int i=0; i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		
		System.out.println(Arrays.toString(a1));
		
		
		
		
		
		//sum of values in a array
		
	/*	int sum=0;
		
		for(int i=0;i<a1.length;i++)
		{
			sum = sum+a1[i];   //6, 7,
		}
		System.out.println(sum);
		
		//sorting an array
	/*	String a2[] = new String[5];
		a2[0] = "yy";
		a2[1] = "sai";
		a2[2] = "banana";
		a2[3] = "naveen";
		a2[4] = "allampati";
		
		System.out.println("before sorting : " + Arrays.toString(a2));
		Arrays.sort(a2);
		System.out.println("After sorting : " + Arrays.toString(a2));
		
		//ways of array declaration
	/*	for(int i=0; i<a2.length;i++)
		{
			System.out.println("Array-2 :" + a2[i]);
		}
		for(int i=0; i<a2.length;i++)
		{
			System.out.println("Array-1 :"+ a1[i]);
		}

		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a1)); */

		
		
		
		
		
		
		
		
		
		//int a2[] = {1,2,3,4,5};
		
		
		
		
		
		
		
		
		
		
		

	}

}
