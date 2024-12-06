package assignments;

public class CallingStatic_NonStatic_Methods {
	
	static void add() //static with Non-paramterized
	{
		int a=10;
		int b=20;
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub(int a, int b) //static with paramterized
	{
		int sub = a-b;
		System.out.println(sub);
	}
	void mul() //Non-static with Non-paramterized
	{
		int a =2;
		int b =6;
		int mul = a*b;
		System.out.println(mul);
	}
	void div(int a, int b) //Non-static with paramterized
	{
		int div = a/b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingStatic_NonStatic_Methods sm = new CallingStatic_NonStatic_Methods();
		add();
		sub(3,2);
		sm.mul();
		sm.div(4, 2);
	}

}
