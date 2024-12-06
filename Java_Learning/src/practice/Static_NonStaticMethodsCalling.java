package practice;

public class Static_NonStaticMethodsCalling {
	
	/* 
	 * methods ---> static & non- static
	 * 
	 *  static - para & non-para
	 *  non-static - para & non-para
	 *  
	 *  static - calling by its method
	 *  non-static - calling by creating an object by its ref value.
	 * 
	 * 
	 */
	
	static void m1()
	{
		int a=10;
		System.out.println(a + "Ttest1");
	}
	static void m2(int a, String name)
	{
		System.out.println("Test2");
	}
	
    void m3()
    {
    	System.out.println("test3");
    }
    void m4(float f)
    {
    	System.out.println("test4");
    }
   
	public static void main(String[] args) {
		//static method calling
				m1();
				m2(1,"517588");
	    //non-staic method calling
				
				Static_NonStaticMethodsCalling s = new Static_NonStaticMethodsCalling();
				s.m3();
				s.m4(1.23f);
				//Static_NonStaticMethodsCalling v = new Static_NonStaticMethodsCalling();
				//v.m3();
				

				

	}

}
