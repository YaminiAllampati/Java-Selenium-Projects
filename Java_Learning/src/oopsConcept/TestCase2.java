package oopsConcept;

public class TestCase2 extends Hierachy_Inheritence_Login {

	static void wishList()
	{
		System.out.println("wishList the items");
	}
	public static void main(String[] args) {
		
		TestCase2 TC2 = new TestCase2();
		TC2.login();
		wishList();
		
	
	}
}

