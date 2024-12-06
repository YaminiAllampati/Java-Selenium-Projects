package String_Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

//create a array of size 3 and check the given number present in array or not
public class CheckGivenNumPresentinArray {

	public static void main(String[] args) {
		
		String s ="yamn12 44y &hgh5_";
		char c[] = s.toCharArray();
		int l=0;
		int d=0;
		int sp=0;
		int s1;
		
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++) {
			
			if(Character.isLetter(c[i]))
			{
				l++;
			}
			else if(Character.isDigit(c[i]))
			{
				d++;
			}
			else  if(Character.isWhitespace(c[i]))
			{
				sp++;
			}
		
		}
		System.out.println(c.length);
		System.out.println(l);
		System.out.println(d);
		System.out.println(sp);
       
		s1 = c.length - (l+sp+d);
		System.out.println(s1);
		
		
	}
	}
		
		
	/*	int a[] = new int[]{6,4,6,8,10};
		int b[] = new int[5];
		 
		System.out.println("Array a :"+ Arrays.toString(a));
		
		for(int i=0,k=4; i<5;i++,k--)
		{
			       b[k]=a[i];
		}
		
      System.out.println("array b :" + Arrays.toString(b));		
		
	}
}
	
		
		
	/*	int a[] = new int[3];
		int b[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a array: ");
		 for(int i=0;i<a.length;i++)
		 {
			  a[i] =  sc.nextInt();
	     }
		 
		 System.out.println("Array a :"+ Arrays.toString(a));
		
		for(int i=0; i<3;i++)
		{
			       b[i]=a[i];
		}
		
      System.out.println("array b :" + Arrays.toString(b));		
		
	}

		
	}
	
		
		
	/*	int a[] = new int[3];
		int b[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a array: ");
		 for(int i=0;i<a.length;i++)
		 {
			  a[i] =  sc.nextInt();
	     }
		 
		 System.out.println("Array a :"+ Arrays.toString(a));
		
		for(int i=0,k=2; i<3;i++,k--)
		{
			       b[k]=a[i];
		}
		
      System.out.println("array b :" + Arrays.toString(b));		
		
	}
}
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("String-1 :");
		String s1 =sc.next();
		char c1[] = s1.toCharArray();
		System.out.println("String-2 :");
		String s2 =sc.next();
		char c2[] = s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Aanagram");
		}
		else {
			System.out.println("Not an Anangram");
		}

}

		
	/*	int a[] = new int[] {1,2,3};
		int n=3;
		
		for(int i = 0; i<3; i++)
		{
			if(a[i]==n)
			{
				System.out.println(n + " "+ "is present in array");
				System.out.println(i + " "+ "is the index of given a value in array");
			}
		}

		
		/* int n=12;
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int n = s.nextInt();
		System.out.println("Enter the array values:");
		int a[] = new int[5];
		//a[0] = s.nextInt();
		for(int i=0; i<5;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<5;i++)
		{

			if(n==a[i])
			{
				flag =1;//System.out.println("Given number :" + n + "present");
			}
			else
			{
				flag=0;System.out.println("Given number :" + n + "not present");

			}
		} 
		*/

		 
	


