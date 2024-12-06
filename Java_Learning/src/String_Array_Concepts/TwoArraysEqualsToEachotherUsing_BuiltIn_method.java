package String_Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysEqualsToEachotherUsing_BuiltIn_method {

	public static void main(String[] args) {
          
		int a[] = new int[3];
		int b[] = new int[2];
		Scanner s = new Scanner(System.in);
		System.out.println("Array 1:");
		for(int i=0; i<3; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Array 2:");
		for(int i=0; i<2; i++)
		{
			b[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(b));
		
		System.out.println("Array output :" + Arrays.equals(a, b));

	}
}
		
		
		
	