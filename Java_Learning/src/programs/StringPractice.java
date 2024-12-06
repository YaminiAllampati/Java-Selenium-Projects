package programs;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		 System.out.println("enther the gender :");
		 char c = s.next().charAt(0);
		 System.out.println("enter the age :");
		 int a = s.nextInt();
		  if(c=='m')
		  {
			  if(a<2)
			  {
				  System.out.println("kids");
			  }
			  else if(a>2 && a<20)
			  {
				  System.out.println("teen");
			  }
			  else
			  {
				  System.out.println("adults");
			  }
		  }
		  else
		  {
			  System.out.println("Tickts are free for women");
		  }
	}

}
