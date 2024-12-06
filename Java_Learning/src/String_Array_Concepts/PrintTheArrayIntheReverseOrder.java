package String_Array_Concepts;

import java.util.Arrays;

public class PrintTheArrayIntheReverseOrder {

	public static void main(String[] args) {
		
		int a[] = new int[] {1,2,3,4};
		
       System.out.println(Arrays.toString(a));
       
    //   int b[] = new int[3];
	
	for(int i=a.length-1; i>=0; i--)
	{
		System.out.print(a[i] + " ");
	}


}

}