package String_Array_Concepts;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int a1[] = new int[4];
		a1[0] =1;
		a1[1] =2;
		a1[2] =3;
		a1[3] =4;
	
		int a2[] = new int[4];
		
		for(int i=a1.length-1 ; i>=0; i--)
		{
			a2[(a1.length-1)-i] = a1[i];
		}
		System.out.println(Arrays.toString(a2));
		
	}

}
