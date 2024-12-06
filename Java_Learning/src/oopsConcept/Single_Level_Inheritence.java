package oopsConcept;

class Teacher {  //super class = parent class
	
	int a = 12;
	static int b = 10;
	void m1()
	{
		System.out.println("Single-NSM1");
	}
	static void m2(int a)
	{
		System.out.println("Single-SM1");
	}
	
}

public class Single_Level_Inheritence extends Teacher{ //sub class = child class
	
	void m3()
	{
		System.out.println("single-NSM2");
	}
	static void m4()
	{
		System.out.println("single-SM2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_Level_Inheritence s = new Single_Level_Inheritence();
		System.out.println(s.a);
		System.out.println(b);
		s.m1();
		m2(1);
		s.m3();
		m4();
		
	}

}
