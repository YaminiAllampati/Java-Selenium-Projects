package p1;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class PracticePrograms {

	public static void main(String[] args) {
		
		
		int a[] = new int[]{1,2,3,4,7,8,9};
		int e=0;
		int o=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
	
		}
		System.out.println(e);
		System.out.println(o);
		
		
		
	/*	int a=1;
		int b=2;
		int temp=0;
		  temp=a;
		  a=b;
		  b=temp;
		
   	 System.out.println("a : "+ a);
	 System.out.println("b : "+ b);
	//System.out.println(c);



	/*	//int n=4;
		int fact=1;
		int sum=0;
		int n=128879;
		int r=0;
		int temp=n;
		int c=0;
		
		
	     while(n>0)
	     {
	    	 n=n/10;
	    	 c++;
	     }
	     
	     System.out.println(c);
	  /*   if(temp==sum)
	     {
	    	 System.out.println("palindrome");
	     }
	     else
	     {
	    	 System.out.println("not a palindrome");
	     } */
		
		
		
	}
	}
/*		String s ="yamn12 44y &hgh5_";
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

		 
	
		
	
		
	/*	int a[] = new int[4];
		int b=3;
		Scanner s = new Scanner(System.in);
		System.out.println("Array :");
		for(int i=0;i<a.length;i++)
		{
			        a[i] = s.nextInt();    
		}
		for(int i=0;i<a.length;i++)
		{
			      if(a[i]==b)
			      {
			    	  System.out.println("index : " + i);
			    	  System.out.println(a[i] +" is a present");
			      }
			      else {
			    	  System.out.println(a[i] +" is a not present");

			      }
		}
		
		
	}
	}
	
	/*	int a[] = new int[3];
		int b[] = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Array-1 :");
		for(int i=0;i<a.length;i++)
		{
			        a[i] = s.nextInt();    
		}
		
		System.out.println("Array-2 :");
		for(int i=0;i<a.length;i++)
		{
			        b[i] = s.nextInt();    
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//boolean c = Arrays.equals(a, b);
		if(Arrays.equals(a, b)==true)
		{
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
		

		
		
	}
	
	}
		
	/*	Date d = new Date();
		System.out.println(d.getTime());
		
		Date d1 = new Date(d.getTime() - 1000*60*60*24*4);
		System.out.println(d1);
		
		//date
	    String s = d1.toString();
	    System.out.println(s);
	    System.out.println(s.length());
	    //current date
	    String date = s.substring(8, 10);
	    System.out.println(date);
	    //current year
	    String year = s.substring(s.length()-4, s.length());
	    System.out.println(year);
	    //current month
	    String month = s.substring(4, 7);
	    System.out.println(month);
	    //whole date/month/year
	     System.out.println(date + "/"+ month + "/"+ year);
	     
	    
	    
		
		
	}
}
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.next();
		String o="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			          char c = s.charAt(i);
			          o = o+c;
		}
		
		System.out.println("String output :" + o);
		
		if(o.equals(s))
		{
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}

	}

} */
