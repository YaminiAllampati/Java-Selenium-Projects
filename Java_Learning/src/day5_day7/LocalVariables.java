package day5_day7;

public class LocalVariables {
	
	static void m1()
	{
		int a =12;
		a = 13;
		final int b =13;
	//	b=17; --> can't be able to done due to final variable can't be updated
		System.out.println(a + b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
