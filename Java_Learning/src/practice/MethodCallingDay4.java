package practice;

public class MethodCallingDay4 {
	
	static void m1() {
		System.out.println("First Method");
		
	}
	static void m2() {
		System.out.println("Second Method");
		
	}
	static void m3() {
		System.out.println("Third Method");
		
	}
	static void m4() {
		System.out.println("Fourth Method");
		
	}
	static void m5() {
		System.out.println("Five Method");
		
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		m1();
		m2();
		m3();
		m4();
		m5();

	}

}
