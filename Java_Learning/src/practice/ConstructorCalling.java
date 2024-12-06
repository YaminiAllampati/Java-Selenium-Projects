package practice;

public class ConstructorCalling {
	int x;
	int y;
	
	
	ConstructorCalling (int a, int b) 
	{
		x=a;
		y=b;
	} 
	
	void m1()
	{
		System.out.println(x+y);
	}
	void m2()
	{
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCalling c1 = new ConstructorCalling(1,2);
		c1.m1();
		c1.m2();
	}

}
