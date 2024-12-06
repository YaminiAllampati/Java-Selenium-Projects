package oopsConcept;

abstract class Fb {
	
   public abstract void fb_login();
	abstract void fb_registration();
	
}

abstract class Google1 extends Fb {
	
	private abstract void google_login();
	abstract void google_registration();
}




public class AbstractClass_Methods extends Google1 {
	
	
	private void google_login() 
	{
		
	}	
	void google_registration() 
	{
		
	}
	public void fb_login() 
	{
		
	}
	void fb_registration() 
	{
	
	}

	public static void main(String[] args)
	{
		AbstractClass_Methods m = new AbstractClass_Methods();
		
		m.fb_login();
		m.fb_registration();
		m.google_login();
		m.google_registration();
	}

	

}
