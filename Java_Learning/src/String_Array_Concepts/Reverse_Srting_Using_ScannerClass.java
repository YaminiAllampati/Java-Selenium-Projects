package String_Array_Concepts;

import java.util.Scanner;

public class Reverse_Srting_Using_ScannerClass {

	public static void main(String[] args) {
		
		String output = "";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String s1 = s.next();
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			  char c = s1.charAt(i);
			  output = output + c;
		}
		System.out.println(output);

	}
	

}
