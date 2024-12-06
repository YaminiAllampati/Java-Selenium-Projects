package oopsConcept;

class Google
{
	void login()
	{
		System.out.println("login to the Google Application");
	}
}

class Amazon extends Google{
	
	void login()
	{
		super.login();
		System.out.println("login to the Amazon Application");
	}
}

public class SuperKeyword_Overriding {

	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		a.login();
		
	}

}
