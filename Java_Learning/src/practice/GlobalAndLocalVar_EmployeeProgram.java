package practice;

public class GlobalAndLocalVar_EmployeeProgram {
	int empid; //global variables
	double sal;
	String name;
	int emp;
	
	void m1(int empid, double sal, String name) //local variables
	{
		//this.empid = empid;
		//int emp = 12;
		//emp = this.emp
	    System.out.println(emp);
		System.out.println("Local variables");
		System.out.println(this.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalAndLocalVar_EmployeeProgram g = new GlobalAndLocalVar_EmployeeProgram();
		g.m1(2055703, 400000, "Yamini");
		
		System.out.println(g.empid);
		System.out.println(g.sal);
		System.out.println(g.name);
		//update the global variables
		g.sal = 123423;
		System.out.println(g.sal);
		System.out.println(g.emp);

	}

}
