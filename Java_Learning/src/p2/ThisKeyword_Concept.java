package p2;

//this keyword - is used to assign the local var to global vars
//it is possible only in non-static method
//juts make suere - parameterized var datatype and global var datatype should be same and var na,e can be different
public class ThisKeyword_Concept {
	
	int empid;
	String empname;
    double sal;	
        
	  void m1(int id, String name, double s)
	{
	   System.out.println("hi");
		this.empid = id;
		this.sal = s;
		
	}
	 
	 	

	public static void main(String[] args) {
		
		ThisKeyword_Concept t = new ThisKeyword_Concept();
		
		t.m1(12, "sai", 22.3);
		
		System.out.println(t.empid);
		System.out.println(t.empname);
		System.out.println(t.sal);
		
	}

}
