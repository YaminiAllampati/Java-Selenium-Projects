package day5_day7;

/* Static variable ---> accessing in Static method
 * Static variable ---> accessing Non-Static method
 * Non-Static variable ---> accessing Static Method
 * Non-Static variable --->accessing Non-static Method
 */

public class GlobalVaribales {
	
	static int a = 10;
	float b = 12.4f;
	void m4()
	{
		m1();
	}
	static void m1()
	{
		main(null);
		//m2();
		System.out.println("static variable accesing in static method : " + a); //static variable to static method
		GlobalVaribales g = new GlobalVaribales();
		System.out.println("non-static variable accesing in static method : " + g.b); // non-static variable to static method
	}
	void m2()
	{
		m4();
		m1();
		System.out.println("non-static variable accesing in  static method : " + a); //static variable to non-static method
		System.out.println("non-static variable accesing in  static method : " + b); //non-static variable to non-static method
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		GlobalVaribales g1 = new GlobalVaribales();
		g1.m2();
		

	}

}
