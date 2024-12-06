package practice;

class Super {
	void m1()
	{
	 System.out.println("heloo"); 
	
	}
}

class Sub extends Super { //its methodovrrloading?
    
	void m1()
	{
		System.out.println("heloo");
	}

}
public class Inheritenceprcatice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.m1(1);
	//	s.m1();
	
		
		
	}

}
