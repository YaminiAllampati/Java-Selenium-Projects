package String_Array_Concepts;

import java.util.Arrays;

public class ReverseASentence {

	public static void main(String[] args) {

		String s = "Yamini Allampati 1428 2055703";
		
		String s1[] = s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		//reverse a sentence
		
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.print(s1[i] + " ");
		}
	}

}
