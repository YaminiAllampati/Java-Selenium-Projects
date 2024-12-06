package day5_day7;

public class Constractors {
	
	/* Constructors are non-static with no return value
	 * Constructors name should be class name
	 * constructor can be 2 types : 1)default/Non-parameterized constructor 2)Parameterized constructor
	 * constructor overloading is also covered as constructor name should always be class name
	 */
	
	
	//non-paramterized
	
	Constractors()
	{
		System.out.println("non-paramterized consturctors");
	}
	
	//parameterized constructor
	
	Constractors(int a, int b)
	{
		System.out.println("Paramterized consturctors : " + (a+b));
	}
	
	
	
	
	public static void main(String[] args) {
		//type 1 to write the constructor
		Constractors c = new Constractors();
		Constractors c1 = new Constractors(1,2);
		//type 2 to write the constructor
		new Constractors();
	    new Constractors(1,2);
		
		
		

	}

}
