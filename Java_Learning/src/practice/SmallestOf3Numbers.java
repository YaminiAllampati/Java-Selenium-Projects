+package practice;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=2;
		int c=1;
		if((a<b)&&(a<c)) 
		{
			System.out.println("Smallest number is :"+a);
			
		}
		else if((b<a)&&(b<c)) 
		{
			System.out.println("Smallest number is :"+b);
			
		}
		else
		{
			System.out.println("Smallest number is :"+c);
				
			
		}
		

	}

}
