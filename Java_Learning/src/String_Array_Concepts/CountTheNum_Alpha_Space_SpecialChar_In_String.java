package String_Array_Concepts;

import java.util.Arrays;

public class CountTheNum_Alpha_Space_SpecialChar_In_String {

	
		
		public static void main(String[] args)
		{
			String s="yamini 123 @12Allam _";
			
			char c[] = s.toCharArray();
			System.out.println(Arrays.toString(c));
			
			int alpha =0;
			int num=0;
			int sp=0;
			for(int i=0;i<c.length; i++)
			{
				 boolean b= Character.isLetter(c[i]);
				 if(b==true)
				 {
				  alpha = alpha +1;
			     }
		}
			System.out.println(alpha);
			for(int i=0;i<c.length; i++)
			{
				 boolean b= Character.isDigit(c[i]);
				 if(b==true)
				 {
				  num = num +1;
			     }
		}
			System.out.println(num);
			
			for(int i=0;i<c.length; i++)
			{
				 boolean b= Character.isWhitespace(c[i]);
				 if(b==true)
				 {
				  sp = sp +1;
			     }
		}
			System.out.println(sp);
			
			int spe = c.length - (alpha+num+sp);
			 System.out.println(spe);
			



	}
	}
	