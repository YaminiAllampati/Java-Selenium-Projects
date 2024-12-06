package practice;

public class Method {
	int y=12;
	static int m = 18;
	// static vara - call in non-static method - not possible
	// non-static vara - call in static method
	
	void m1()
	{
		System.out.println(m);
		System.out.println(y);
	}
 
	static void m2()
	{
		
		Method w = new Method();
		w.y=19;
		System.out.println(w.y);
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Method m = new Method();
    m.m1();
    m.m2();
   
    
    
    
	}

}
