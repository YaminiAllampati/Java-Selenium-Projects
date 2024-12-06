package practice;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		int sum=0;
		int rem;
		
		while(num>0)
		{
			rem = num%10;
			sum= sum*10 + rem;
			num=num/10;	
		}
		
		System.out.println(sum);
	}

}
