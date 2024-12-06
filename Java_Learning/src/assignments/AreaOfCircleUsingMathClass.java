package assignments;

public class AreaOfCircleUsingMathClass {
	
	final double pi = Math.PI; //value of pi

	public static void main(String[] args) {
		
		AreaOfCircleUsingMathClass a = new AreaOfCircleUsingMathClass(); //creating object due to non-static global variable.
		double area;		
		for(int i=1; i<=10; i++)
		{
			double r = Math.random();
			area = a.pi*r*r;
			System.out.println(area);
			
		}
		
	}

}
