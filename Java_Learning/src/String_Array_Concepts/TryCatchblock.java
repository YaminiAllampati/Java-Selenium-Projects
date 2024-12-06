package String_Array_Concepts;

public class TryCatchblock {
	

	public static void main(String[] args) {
		
		try 
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a)
		{
			System.out.println("test1");
			//try {
		int a1=1/0;
		System.out.println(a1);
			//}
			//catch(ArithmeticException b)
			//{
			//	System.out.println("error");
			//}
		
		}
		
		System.out.println("print the values");

	}

}
