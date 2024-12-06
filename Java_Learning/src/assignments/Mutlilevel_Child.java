package assignments;

public class Mutlilevel_Child extends MutiLevel_Parents{
	 
	
	void m3()
	{
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		Mutlilevel_Child c = new Mutlilevel_Child();
		c.m1();
		c.m2();
		c.m3();

	}

}
