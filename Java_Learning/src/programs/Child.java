package programs;



abstract class parent {
	
	abstract void m1();
	abstract void m2();
	
	static void m3()
	{
		
	}
	
public class Child extends parent{

public static void main(String[] agrs)
{

	Child c = new Child();
	c.m1();
	c.m2();
}

@Override
void m1() {
	// TODO Auto-generated method stub
	
}

@Override
void m2() {
	// TODO Auto-generated method stub
	
}
}
}

