package String_Array_Concepts;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s1 ="yamini";
		String ch =" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char s2 = s1.charAt(i);
			ch = ch+s2;
			
		}
		System.out.print(ch);
	}

}
