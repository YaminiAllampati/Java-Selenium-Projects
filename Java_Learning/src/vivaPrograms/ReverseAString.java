package vivaPrograms;

public class ReverseAString {

	public static void main(String[] args) {

		String s ="Yamini";
		String output = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			         char c = s.charAt(i);
			         output = output+c;
		}
		System.out.println(output);
	}

}
