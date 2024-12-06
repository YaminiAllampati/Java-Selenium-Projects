package oopsConcept;

public class TestCase1 extends Hierachy_Inheritence_Login {
	
	static void search()
	{
		System.out.println("Search the items");
	}
	
	public static void main(String[] args) {
		
		TestCase1 TC1 = new TestCase1();
		TC1.login();
		search();
		
		

	}

}
