package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n = 121;
		int r;
		int orgnum = n;
		
        while(n>0)
        {
        	r = n%10;
        	sum = sum * 10 + r;
        	n=n/10;
        }
        if(orgnum==sum)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("Not a palindrome");
        }
	}

}

