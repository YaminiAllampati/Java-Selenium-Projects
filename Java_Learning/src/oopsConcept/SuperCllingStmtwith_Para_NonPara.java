package oopsConcept;

class Abc {
	
	Abc()
	{
	 System.out.println("Cons1");
	}
}
class Xyz extends Abc{
	
	Xyz(int a)
	{
		super(); //optional
	 System.out.println("Cons2");
	}
}

class Pqr extends Xyz {
	
	Pqr(float b)
	{
		super(3);
	 System.out.println("Cons3 :");
	}
}

public class SuperCllingStmtwith_Para_NonPara extends Pqr {
	
	SuperCllingStmtwith_Para_NonPara()
	{
		super(3.99f);
		System.out.println("Cons4");
	}

	public static void main(String[] args) {
		
		SuperCllingStmtwith_Para_NonPara p = new SuperCllingStmtwith_Para_NonPara();
	}

}
