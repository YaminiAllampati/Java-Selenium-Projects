package assignments;

import java.util.Arrays;

//import java.util.Scanner;

public class TwoArraysEquals_OrNot_Using_char_Datatype {

	public static void main(String[] args) {
    //Char array
		char c1[] = new char[3];
		c1[0] = 'a';
		c1[1] = 'b';
		c1[2] = 'c';
		System.out.println("Array1 :" + Arrays.toString(c1));
		char c2[] = new char[3];
		c2[0] = 'a';
		c2[1] = 'b';
		c2[2] = 'c';
		System.out.println("Array2 :" + Arrays.toString(c1));

		System.out.println("Ouput :" + Arrays.equals(c1, c2));		
		
		
	}

}
