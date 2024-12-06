package p2;

/*static var --> can be accessible to static methods & non-static methods - without creating any object.
	Non static  --> can be accessible only to non-static methods - without creating any object
	Non static --> can be accessible only static methods - by creating an object
	*/

public class GlobalVarPractice {  
	
     static int a =8; //static var
      int  b=2;//non- static var
   
     
     void m1()
     {

    	 System.out.println(a);
    	 System.out.println(b);
    	 
    	
     }
     
     static void m2()
     {

    	 GlobalVarPractice v = new GlobalVarPractice();
    	 System.out.println("m2");
    	 System.out.println( a);
    	 System.out.println(v.b);
  
    	 
     }
     

	public static void main(String[] args) {
	
		System.out.println(a);
		GlobalVarPractice v1 = new GlobalVarPractice();
	    System.out.println(v1.b);
		v1.m1();
		m2();
		
		
	    
	  
	   
	    
	}

}
