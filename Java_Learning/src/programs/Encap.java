package programs;

public class Encap {
	
	private int b;
	
	public void setter(int c) {
		
		this.b = c;
	}
	
	public int getter()
	{
		return b; 
	}
	


	public static void main(String[] args) {

		Encap e = new Encap();
		e.setter(3);
		System.out.println(e.getter());
	}

}
