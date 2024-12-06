package oopsConcept;

/* 
 * this keyword will be used to assign the local var to global var.
 * can be used only in non-static method
*/

public class ThisKeyword {
	
	int empid; //global variables
	double sal;
	String name;
	static int emp;
	
	void m1(int empid, double sal, String name) //local variables
	{
		
	   this.empid = empid;
	   this.sal = sal;
	   
	   System.out.println("Local variables");
	   //this.name = name;
	}

	public static void main(String[] args) {
		
		ThisKeyword t  = new ThisKeyword();
		 t.m1(2, 3, "Yamini");
		 System.out.println("Global variables :" + t.empid);
		 System.out.println("Global variables :" + t.sal);
		 System.out.println("Global variables :" + t.name); //it is taking null value due to local var is not assigned to global var. 
		 
	}
}
