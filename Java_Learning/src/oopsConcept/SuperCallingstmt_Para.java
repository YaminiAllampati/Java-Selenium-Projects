package oopsConcept;

//para should always calls explicitly

class GPar {
	GPar(float f)
	{
		System.out.println("Cons1");
	}
}

class Par extends GPar {
	Par(int a)
	{
         super(1.3f);
		System.out.println("Cons2");
	}
}

public class SuperCallingstmt_Para extends Par {
	
	SuperCallingstmt_Para(String name)
	{
		super(12);
		System.out.println("Cons3");
	}
	

	public static void main(String[] args) {
		
		SuperCallingstmt_Para p = new SuperCallingstmt_Para("Yam");
	}

}
