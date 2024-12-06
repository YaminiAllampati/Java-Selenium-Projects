package oopsConcept;

class Principle {
	
	int a = 12;
	void m1()
	{
		System.out.println("Multilevel-NSM1");
	}
}

class Hod extends Principle {
	
	static int b = 14;
	static void m2()
	{
		System.out.println("Multilevel-SM1");
	}
}

public class Mutilevel_Inheritence extends Hod {
	
	void m3()
	{
		System.out.println("Multilevel-NSM2");
	}
 
	public static void main(String[] args) {
	/* we can create a object separately for all the parent classes
	 *  to  call all the methods/var's in a child class

		System.out.println("grandparent class");
		Principle p = new Principle();
		p.m1();
		System.out.println("parent class");
		Teacher t = new Teacher();
		t.m1();
		m2();//need to check */ 
		Mutilevel_Inheritence m = new Mutilevel_Inheritence();
		System.out.println(m.a);
		m.m1();
		System.out.println(b); //need to check by giving a here
		m2();
		m.m3();
		
	}

}
