package String_Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Program_with_Scanner_Class {
	
	static boolean b;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First string :");
		String s1= s.next();
		System.out.println("Enter the Second string :");
		String s2= s.next();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		System.out.println("Array-1 before sorting:" + Arrays.toString(c1));
		System.out.println("Array-2 before sorting:" + Arrays.toString(c2));

		
		//sort the array
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		//after sorting
		System.out.println("Array-1 after sorting:" + Arrays.toString(c1));
		System.out.println("Array-2 after sorting:" + Arrays.toString(c2));
		
		//equals or not
		
		for(int i=0;i<3;i++)
		{
			if(c1[i] == c2[i])
			{
				b=true;
			}
			else
			{
				b=false;
			}
		}
		if(b==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");

		}
		
	}

}
