package oopsConcept;

public class TestCase3 extends Hierachy_Inheritence_Login {
	
	 void Cart()
	{
		System.out.println("Add the items to the cart");
	}
	public static void main(String[] args) {
		
		TestCase3 TC3 = new TestCase3();
		TC3.login();
		TC3.Cart();
		
	
	}

}
