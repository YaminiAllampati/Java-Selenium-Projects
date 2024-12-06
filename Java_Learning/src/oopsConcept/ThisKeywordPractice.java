package oopsConcept;
/* 
 * this keyword will be used to assign the local var to global var.
 * can be used only in non-static methods
 * 
*/
public class ThisKeywordPractice {
	
	
	int a; //global variables
	String name;
	float f;
	static int b;
	int d;
	//int e =12;
	
	void m1(int x, String y, float z)
	{
		int c = 10;
	/*	int g;
	    g=e; // no use of using global-->local, since we can global var for all the method.
    */
		this.a = x;
		this.name = y;
		this.f = z;
		this.d = c; //need to check in old notes x=a?
		//this.b = p; //need to check static
		
		System.out.println("Local Variables :" + x);
		System.out.println("Local Variables :" + y);
		System.out.println("Local Variables :" + z);
		//System.out.println("Local Variables :" + p);
		//System.out.println("Local Variables :" + g);

			
	}
	/* static void m2(int q) //this keyword can't be able to use inside the static method
	{
		this.b = q;
	}  */

	public static void main(String[] args) {
		ThisKeywordPractice t = new ThisKeywordPractice();
		t.m1(2, "Yamini", 2.34f);
		System.out.println("Global Var :" + t.a);
		System.out.println("Global Var :" + t.name);
		System.out.println("Global Var :" + t.f);
		System.out.println("Global Var :" + t.d);
		System.out.println("Global Var :" + b); //because it is not assigned to local variable

		
		

	}

}
