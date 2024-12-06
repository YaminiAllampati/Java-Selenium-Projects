package oopsConcept;

//WAP for 1 abstract classes & 2 Concrete classes
//abstract class - can contain both abstract & concrete methods
abstract class Abc1 {
	
    abstract void m1(int a);
	abstract void m2();
	static void m3()
	{
		System.out.println("hllll");
	}
}
//concrete classes
class Xyz1 extends Abc1{
	static void m3()
	{
		System.out.println("Hi");
	}
	void m4()
	{
		System.out.println("Hello");
	}
//overridden abstract methods
	@Override
    void m1(int a) {
		System.out.println("a");

	}
	@Override
	void m2() {
		System.out.println("b");

	}
}
	
public class AC1_C2 extends Xyz1{

	public static void main(String[] args) {
		
		AC1_C2 c = new AC1_C2();
		m3();
		c.m1(3);
		c.m2();
		c.m4();
		
	}

}
