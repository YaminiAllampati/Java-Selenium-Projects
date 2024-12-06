package String_Array_Concepts;

import java.util.Arrays;

public class Program_CopyOneArrayValuestoANotherArray {

	public static void main(String[] args) {
   
		int a1[] = new int[] {1,2,3};
		int a2[] = new int[3];
		
		System.out.println("Array-1 :" + Arrays.toString(a1));
		
		for(int i=0; i<3; i++)
		{
			a2[i] = a1[i];
		}
		
		System.out.println("Array-2 :" + Arrays.toString(a2));
			
	}

}
