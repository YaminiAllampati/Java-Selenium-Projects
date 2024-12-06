package String_Array_Concepts;

import java.util.Arrays;

/* to find the anagarm
 * 1) change to string into char array
 * 2)then sort the char array(we cant able to sort the string directly
 * 3)check the 2 arrays are equal or not
 */

public class String_Anagaram_Program {

	public static void main(String[] args) {
           
		String s1 = "car"; //check with scanner class
		String s2 = "bus";
		//converted string to array
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		System.out.println("before sorting of c1 :" + Arrays.toString(c1));
		System.out.println("before sorting of c2 :" + Arrays.toString(c2));
		//sort the char arrays
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("after sorting of c1 :" + Arrays.toString(c1));
		System.out.println("After sorting of c2 :" + Arrays.toString(c2));
		
		//equal or not
		boolean b = Arrays.equals(c1, c2);
		if(b==true)
		{
			System.out.println("Output: Anagram");
		}
		else
		{
			System.out.println("Output: Not an anagram");
		}
		
	}

}
