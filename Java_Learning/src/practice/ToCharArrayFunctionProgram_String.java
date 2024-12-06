package practice;

import java.util.Arrays;

public class ToCharArrayFunctionProgram_String {

	public static void main(String[] args) {
		
		String s = "yamini";
		System.out.println("before coverting into char array :" + s);
		char c[] = s.toCharArray();		
		System.out.println("length of the string : " +  c.length);
		System.out.println("After coverting into char array :" + Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("After sorting the array :" + Arrays.toString(c));
		//System.out.println();
		//System.out.println(Arrays.sort(c));
	}

}
