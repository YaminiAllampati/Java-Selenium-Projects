package oopsConcept;

/* Super calling statements can be in 2 ways: 1)para 2)non-para
 * we can written in 2 ways : 
 * 1)implicitly  - we no need to mentioned super(), it will call automatically
 * 2)explicitly  - we can mention explicitly with super() stmt.
 * 
 * Parameterized - can be only written in explicitly
 *  on-papamerterized - can be written in both ways(implicitly & explicitly)
 *  It can be only possible in during inheritance class
 *  we should always mention super() in first line inside the constructor
 
 */

class GrandParents {
	GrandParents()
	{
		System.out.println("Cons1");
	}
}

class Parents extends GrandParents{
	Parents()
	{
		super(); //optional
		System.out.println("Cons2");
	}
}

public class SuperCallingStmt_Non_Para extends Parents{
	
	SuperCallingStmt_Non_Para()//child class
		{
		     super();//optional
			System.out.println("Cons3");
		}
	
	public static void main(String[] args) {
		
		SuperCallingStmt_Non_Para s = new SuperCallingStmt_Non_Para();

	}

}
