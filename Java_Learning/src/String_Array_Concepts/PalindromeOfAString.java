package String_Array_Concepts;

public class PalindromeOfAString {

	public static void main(String[] args) {
		
		String s1 ="madam";
		String s2 ="";
		boolean temp;
		
		for(int i=s1.length()-1; i>=0; i--)
			{
			     char ch = s1.charAt(i);
			     s2 = s2+ch;
			     
			     
			}
		temp = s1.equals(s2);
		if(temp==true) //((s1.equals(s2) == ture)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
