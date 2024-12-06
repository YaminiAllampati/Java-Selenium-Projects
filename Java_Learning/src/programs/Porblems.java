package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Porblems {

	public static void main(String[] args) {
		
		int a[] = new int[] {1,2,3,4};
		int b[] = new int[4];
		for(int i=0, k=3; i<4; i++, k--)
		{
			
              	b[k] = a[i];		
		}
		
		System.out.println(Arrays.toString(b));
	}
	
	
	}
		
	
		
		
		/*	int a[] = new int[] {1,2,3,4};
		int b[] = new int[4];
		for(int i=3; i>=0;i--)
		{
			//System.out.println(a[i]);
			b[i] = a[(a.length-1)-i];
			
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		/*	int a[] = new int[] {1,2,3,4};
		
		int b[] = new int[4];
		
		for(int i=0; i<4; i++)
		{
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
	}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String s1 = "arm";
		String s2 ="ram";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		 System.out.println(Arrays.toString(c1));
		 System.out.println(Arrays.toString(c2));
		 
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 
		 boolean b = Arrays.equals(c1, c2);
		 
		 if(b==true)
		 {
			 System.out.println("anagram");
		 }
		 else {
			 System.out.println("not anagram");
		 }
		 
		
		
		
		
		
		
	}
	}
		
	/*	int a[] = new int[] {1,3,2,7,9,4};
		
		System.out.println("before sorting : " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting : " +Arrays.toString(a));
	}
	}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String s = "yamini";
		
		char c[] = s.toCharArray();
		
		// System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(Arrays.toString(c));

		
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	int a[] = new int[] {1,34,2};
			for(int i =0; i<3;i++)
		{
			if(a[i]==34)
			{
				System.out.println("present");
				System.out.println(i);
			}
		}
		
		
	}
	
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	int a[] = new int[3];
		
		Scanner s = new Scanner(System.in);
         System.out.println("emter the array values :");
         
         for(int i=0; i<3;i++)
         {
         
               a[i] = s.nextInt();
         }
         
         System.out.println(Arrays.toString(a));
		
		
	}
	}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String s1[] = new String[] {"yam","jam","fam"};
		String s2[] = new String[] {"yam","jam","fam"};
		
		boolean b = Arrays.equals(s1, s2);
		
		System.out.println(b);
	}
}
		
		

		
		

 
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		int a[] = new int[] {1,4,3,4};
		
		int b[] = new int[] {1,2,7,4};
		
	   boolean c = true;
	   
	 System.out.println(Arrays.toString(a));
	 System.out.println(Arrays.toString(b));
		
		for(int i =0; i<a.length; i++)
		{
			if(a[i]==b[i])
			{
			    c=true;
			}
			else
			{
				c=false;
				break;
			}
		}
		if(c==true)
		{
			System.out.println("array equals");

		}
		else
		{
			System.out.println("arrays not equals");
		}
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
		// System.out.println(Arrays.equals(a, b));
		
		
		
		
		
	}
	
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String s = "man";
		
		String p ="";
		
		for(int i= s.length()-1; i>=0; i--)
		{
			p = p + s.charAt(i);
		}
		
		System.out.println(p);
		
	 if(s.equals(p))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		} 
	}
	
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	String s = "yamini";
		String output = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			output = output + s.charAt(i) + " ";
		}
		
		System.out.println(output);
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*double pi = 3.143;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the value of a :");
		int a = s.nextInt();
		System.out.println("enter the b value :");
		int b = s.nextInt();		
	System.out.println(Math.addExact(a, b));
	System.out.println(Math.max(a, b));
	System.out.println(Math.subtractExact(a, b));
	System.out.println(Math.multiplyExact(a, b));
	System.out.println(Math.min(a, b));
	
	for(int i =0; i<=10; i++)
	{
		double area = pi*Math.random();
		
		System.out.println(area);
	}
	
	
	
	
	
	
	
	
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/*	int a[] = new int[] {1,2,3,4,5,6,7,8};
		
		int e[] = new int[8];
		int c=0;
		int o[] = new int[8];
       int d=0;		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even :" + a[i]);
				
				e[i] = a[i];
				c++;
			}
			
			else
			{
                 System.out.println("odd :" + a[i]);
                 
                 o[i] = a[i];
                 d++;
			}
		}
		System.out.println("even :" + Arrays.toString(e));
		System.out.println("odd :" + Arrays.toString(o));
		System.out.println(c);
		System.out.println(d);

		
		
		} 

} */
