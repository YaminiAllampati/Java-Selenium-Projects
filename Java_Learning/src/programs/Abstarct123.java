package programs;

//Abstraction:
//abstract class //- 100% abstraction is not possible - because of concrete class e
//interface //- 100% abstraction is  possible - because of it will have only abstract

interface c3{
	
	void m1();
	
}

interface c4{
	
	 void m2();
}


 public class Abstarct123 implements c3,c4 {
	 
	 
     void m3()
     {
    	 System.out.println("test3");
     }
	 	 
	 
	public static void main(String[] args) {
		Abstarct123 b = new Abstarct123();
		b.m1();
		b.m2();
		b.m3();
		
	}

	@Override
	public void m1() {

		System.out.println("test1");
	}

	@Override
	public void m2() {
		System.out.println("test2");

	}
	
	}
		
	