package String_Array_Concepts;

import java.util.Arrays;

public class TwoArrayEqualstoEachOther {
	static boolean b;
	public static void main(String[] args)
	{
	int a1[] = new int[]{1,2,3,4};
	System.out.println(Arrays.toString(a1));
	int a2[] = new int[]{1,3,3,4};
	System.out.println(Arrays.toString(a2));
	for(int i=0; i<3;i++)
	{
		
		 if(a1[i]==a2[i])
		{
            b=true;
		}
		else
		{

		    b=false;
		    break;
		
		}
		  
}
if (b==true)
{
   System.out.println("Two arrays are equal");
}
else
{
 System.out.println("Two arrays are not equal");
}

}
}



