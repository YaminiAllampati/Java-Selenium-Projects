package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_scanner {

	public static void main(String[] args) {
		
		int a1[] = new int[3];
		int a2[] = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("enter array1:");
		for(int i=0; i<3;i++)
		{
			     a1[i]= s.nextInt();
         }
		
		System.out.println(Arrays.toString(a1));
		System.out.println("enter array2:");

		for(int i=0; i<3;i++)
		{
			     a2[i]= s.nextInt();
         }
		System.out.println(Arrays.toString(a2));
		
		//boolean b = Arrays.equals(a1, a2);
		if(Arrays.equals(a1, a2))
		{
			System.out.println("equls");
		}
		else
		{
			System.out.println("not equls");
		}


	/*	Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		    String s1 = s.next();
		    
		    String output ="";
		    for(int i=s1.length()-1; i>=0;i--)
		    {
		    	  char ch = s1.charAt(i);
		    	  output  = output + ch;  
		    }
		    
		    System.out.println(output);
		    
		    if(s1.equals(output))
		    {
		    	System.out.println("palin");
		    }
		    else
		    {
		    	System.out.println("not");
		    }
		    
		    
	/*	    int sum=0;
		    int r;
		    int temp = n;  //n=343;
		  
		    while(n!=0)  //30+
		    {
                  r = n%10;
                  sum=r+sum*10;//34+
                  n=n/10;
		    }
		    
		    if(temp==sum)
		    {
		    	System.out.println("palindrome");
		    }
		    else {
		    	System.out.println("not ");
		    } */
	}

}
