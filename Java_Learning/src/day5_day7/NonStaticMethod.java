package day5_day7;

public class NonStaticMethod {
	
	void output()  //Non-static with Non-paramterization
	{
		int a=1;
		int b=3;
		if(a==1 && b==3) 
		{
			System.out.println("Executed succefully");
		}
		
	}
	void registration(String urn, String pas, long mob, String DOB )  //Non-static with paramterization
	{
		System.out.println("Login succefully");	
	}
 
	public static void main(String[] args) {
		NonStaticMethod sm = new NonStaticMethod();
		sm.output();
		sm.registration("yamini@gmail.com", "yamini1428", 12329898787l, "14/10/1999");
		
		

	}

}
