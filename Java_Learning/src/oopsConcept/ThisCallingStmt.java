package oopsConcept;

public class ThisCallingStmt {
	
	ThisCallingStmt()
	{
		this(2,2.342);
		System.out.println("Cons1");
	}
	ThisCallingStmt(int a)
	{
		this();
		System.out.println("Cons2");
	}
	ThisCallingStmt(int a, double b)
	{
		this(1,2);
		System.out.println("Cons3");
	}
	

	public static void main(String[] args) {
		
		

	
		ThisCallingStmt t = new ThisCallingStmt(12);
		
		
			

	}
	ThisCallingStmt(int a, int b)
	{
		System.out.println("Cons4");
	}

}
