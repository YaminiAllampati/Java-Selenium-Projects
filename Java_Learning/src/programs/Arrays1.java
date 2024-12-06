package programs;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {

		String s ="yamini";
		String s1 ="alLAmpati yamini";
		String b ="Yamini";
		StringBuffer i = new StringBuffer("yamini");
		
		System.out.println(i.replace(1, 3, "kk"));
		System.out.println(i.capacity());
		i.reverse();
		System.out.println(i);
		System.out.println(i.append("gfgdf"));
		System.out.println(i.insert(1, "asasas"));

		
		
		System.out.println(s.length());
		
		System.out.println(s.substring(2, 4));
		System.out.println(s.substring(1));
		System.out.println(s1.replaceAll("[a-z]", "_"));
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('y'));
		char c[] = s.toCharArray();
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		 String k[] = s1.split(" ");
		 System.out.println(Arrays.toString(k));
		 System.out.println(s.equals(b));
		 System.out.println(s.equalsIgnoreCase(b));
		 
		 System.out.println(s.concat(b));
		 System.out.println(s.contains("yamini"));
		
		

		
	}

}
