package oopsConcept;

class Parent
{
	 static void m1()
	{
		System.out.println("Parent");
	}

}

public class Superkeyword extends Parent{
	
	void m1() // super keyword can't be possible in static methods.
	{
		super.m1();
		System.out.println("Child");
	}

	public static void main(String[] args) {
		
	}

}
