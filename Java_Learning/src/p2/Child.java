package p2;

//this calling stmt(super()) --> to call the one cons from another cons within the same class
//1)non-para 2)para
//1)non-para --> we can declare only expilicity 
//2)para --> we can declare only expilicity

public class Child {
	
	Child()
	{
		this(1.2f, "sai");
		System.out.println("cons1");
	}
	
	Child(int a)
	{
		this(2,3);
		System.out.println("cons2");
	}
	
	Child(int a, int b)
	{
		
		System.out.println("cons3");
	}
	
	Child(float a, String b)
	{
		this(3);
		System.out.println("cons4");
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();

	}

}
