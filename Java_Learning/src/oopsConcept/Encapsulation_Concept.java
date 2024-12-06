                                                                          package oopsConcept;

/*encapsulation
 *  To restrict the accessing of sensitive data by its a private.
 *  giving indirect access usning getter & setter method
 *  all the var should be in private 
 *  we can access those var by using getter and setter methods
 *  instead of accesing directly, we are accessing using getter &  setter method
 *  set method will always be paramterized 
 *  setter method - take the paramter and assign the value to para
 *  getter method - return the parameter value
 */


public class Encapsulation_Concept {
	
	private int pswd = 123443;
	private String uname;
	
	public void setpswd(int p)
	{
		this.pswd = p;
	}
	public int getpswd()
	{
		return pswd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public static void main(String[] args) {
		
		Encapsulation_Concept e = new Encapsulation_Concept();
		e.setpswd(898989);
		System.out.println("password : " + e.getpswd());
		
		e.setUname("yamini@1428");
		System.out.println("user name : " + e.getUname());
		
		
		

	}

}
