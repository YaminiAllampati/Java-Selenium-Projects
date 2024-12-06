package practice;

//multiple-level -> 

class Gparent {
	
	int a =12;//static or non-static
	
	void Gp()
	{
		System.out.println("Gparent method");
	}
}

class Parent extends Gparent{
	
	static int b = 13;
	
	static void p()
	{
		System.out.println("parent method");
	}
}

public class Child extends Parent {
	
	int d = 12;
	
	void c()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
	
	
	Child k = new Child();
	
	System.out.println(k.a);
	System.out.println(b);
	System.out.println(k.d);
	
	k.Gp();
	p();
	k.c();
	
	
	
	
	
	
	
		

	}

}
