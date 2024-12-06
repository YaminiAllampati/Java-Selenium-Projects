package practice;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 124676787;
		int c=0;
		while(n>0)
       {
			
    	   n=n/10;
    	   c=c+1;

       }
		System.out.println(c);
	}

}
