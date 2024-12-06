package practice;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int a[] = new int[] {4,2,3,1};
		
		int b[] = new int[4];
		
		for(int i=0;i<4;i++)
		{
			if(a[i]>a[i+1])
			{
               a[i]=a[i+1];
               a[i+1]=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
	
		
		
	}

}
