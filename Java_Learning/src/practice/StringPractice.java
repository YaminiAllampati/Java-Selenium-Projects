package practice;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {

		String s = "Yamini";
		String output ="";
		
		int a = s.length();
		System.out.println(a);
		
		//char c[] = s.toCharArray();
	//	System.out.println(Arrays.toString(c));
		
		for(int i =s.length()-1; i>=0; i--)
		{
			
               output  = output+s.charAt(i);
		}
		System.out.println(output);
		
		
		
		
	}

}
