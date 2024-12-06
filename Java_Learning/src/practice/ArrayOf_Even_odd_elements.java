package practice;

import java.util.Arrays;

public class ArrayOf_Even_odd_elements {

	public static void main(String[] args) {

		 int a[] = new int[]{1,2,3,4,5,6,7,8,9};
		 int e=0;
		 int o=0;
		 int b[] = new int[9];
		 int c[] = new int[9];
		 
		 for(int i=0; i<=a.length-1;i++)
		 {
			 if(a[i]%2==0)
			 {
				 e=e+1;
				 b[i] = a[i];
				 System.out.println("even :" + b[i] + " ");
			 }
			 else
			 {
                  o=o+1;
                  c[i] = a[i];
                  System.out.println("odd :" + c[i] + " ");
			 }
		 }
		 System.out.println();
		 System.out.println("Even : " + e);
		 System.out.println(Arrays.toString(b));
		 System.out.println("Odd : " + o);
		 System.out.println(Arrays.toString(c));
		 
		 
		 
		 
	}

}
