package practice;

public class MethodsPractice {
	/*  Write a Java method to find the smallest number among three numbers.
	 Test Data:
	 Input the first number: 25
	 Input the Second number: 37
	 Input the third number: 29
	 Expected Output:

	 The smallest value is 25.0 */
	
        float smallest(float a, float b, float c)
	{
		
		if((a<b) && (a<c))
		{
			return a;
	    }
		else if((b<a) && (b<c))
		{
			return b;	   
	    }
		else 
		{
			return c;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsPractice sm = new MethodsPractice();
         sm.smallest(25,37, 29);
		System.out.println("The smallest value is: " + a);
         System.out.println("The smallest value is: " + b);
         System.out.println("The smallest value is: " + c);
         
	}

}
