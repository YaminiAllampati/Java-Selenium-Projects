package oopsConcept;

//Method Overriding will be possible only in non-static methods

class TestManual {
	final int c;
	
	void m1(int a) //anything but make sure the return type and parameters should be same
	//and body of the method should be different.
	{
		int b=12;
		System.out.println(b);

		System.out.println("Login");
	}
}

public class MethodOverriding extends Test1{
	
	void m1(int a)
	{
	
		System.out.println("Access");
	
	}
	public static void main(String[] args) {
		
		MethodOverriding m = new MethodOverriding();
		m.m1(2);
	}

}
