package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysEquals_OrNot_Using_String_Datatype {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String s1[] = new String[3];
		String s2[] = new String[3];
		System.out.println("Enter Array1 :");
		for(int i=0; i<3;i++)
		{
			s1[i] = s.next();
		}
		System.out.println(Arrays.toString(s1));
		System.out.println("Enter Array2 :");
		for(int i=0; i<3;i++)
		{
			s2[i] = s.next();

		}
		System.out.println(Arrays.toString(s2));
    System.out.println("Output:" + Arrays.equals(s1, s2));
		
	}

}
