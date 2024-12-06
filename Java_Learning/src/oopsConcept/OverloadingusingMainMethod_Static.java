package oopsConcept;

public class OverloadingusingMainMethod_Static {
	
	public static void main()
	{
		double a=12;//4byte //smaller to biggger-->
		int b =(int) a;//8byte
		System.out.println("m1");
	}
	static void main(int a)
	{
		System.out.println("m2");
	}
	static void main(int a, String name)
	{
		System.out.println("m3");
	}
	

	public static void main(String[] args) {
		main();
		main(2);
		main(3, "Yamini");
		
	}

}
