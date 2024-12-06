package practice;

public class FirstProgram {
	int a=10;
	int b=12;
	void m1() {
		System.out.println("addition" +" "  + (a+b));
	}
	void m2() {
		System.out.println("sub" +" " + (a - b));
		
	}
		
	void m3(int c, int d) {
		
		System.out.println(c*d);
	}
		
	
	public static void main(String[] args)
	{
		FirstProgram f = new FirstProgram();
		f.m1();
		f.m2();
		f.m3(2,3);
		
		
		
	}

		// TODO Auto-generated method stub

	}


