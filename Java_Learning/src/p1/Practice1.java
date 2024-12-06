package p1;

public class Practice1 {

	public static void main(String[] args) {

		
		
		try {
			int i =1/0;
			//String s = null;
			//System.out.println(s);
			System.out.println(i);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception12");
		}
		catch (ArithmeticException e1)
		{
			System.out.println("Exception132");
		}
		finally 
		{
			System.out.println("Finally block");
		}
	}

}
