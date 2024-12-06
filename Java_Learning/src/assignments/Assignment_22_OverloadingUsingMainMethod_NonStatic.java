package assignments;

public class Assignment_22_OverloadingUsingMainMethod_NonStatic {
	
	public void main()
	{
		System.out.println("m1");
	}
	 void main(String name)
	{
		System.out.println("m2");
	}
	 void main(int a, double b)
		{
			System.out.println("m3");
		}

	public static void main(String[] args) {
		Assignment_22_OverloadingUsingMainMethod_NonStatic n = new Assignment_22_OverloadingUsingMainMethod_NonStatic();
		n.main();
		n.main("Yamini");
		n.main(2, 4.321);
	}

}
