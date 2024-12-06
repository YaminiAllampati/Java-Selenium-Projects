package String_Array_Concepts;

//array is used to store the homogeneous elements

public class ArrayDeclaration {

	public static void main(String[] args) {
	/* 4 ways to declare the arrays
		int a[] = new int[5];
		int[] a1 = new int[5];
		int[] a2 = new int[ ]{2,4,5,6,8};
		int[] a3 = {1,2,3,4}; */
//Assigning the int values to the array
		
		int a[] = new int[3];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		System.out.println(a[0]);
		
		System.out.println("Array-1");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("2nd type initialization");
		int[] a2 = new int[ ]{2,4,5,6,8};
		System.out.println(a2[3]);
		
		System.out.println("Array-2");
		for(int i=0; i<=a2.length-1; i++)
		{
			System.out.println(a2[i]);
		}
		
//Assigning the String values to the array
		
		String s[] = new String[3];
		s[0] = "yam";
		s[1] = "mini";
		s[2] = "pandu";
		
		System.out.println("String declaration");
		
		for(int i=0; i<=s.length-1; i++)
		{
			System.out.println(s[i]);
		}
		
	//Assigning the boolean values to the array
		
				boolean b[] = new boolean[3];
				b[0] = true;
				b[1] = false;
				b[2] = true;
				
				System.out.println("Boolean declaration");
				
				for(int i=0; i<b.length; i++)
				{
					System.out.println(b[i]);
				}
				
	//Assigning the char values to the array
				
				char c[] = new char[]{'a','y','m','t'};
				System.out.println("char declaration");
				
				for(int i=0; i<c.length; i++)
				{
					System.out.println(c[i]);
				}				
				
						
		
	    
		
		
		
		
		

	}

}
