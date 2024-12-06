package programs;

import java.util.HashSet;
import java.util.Set;

public class Practice2 {

	public static void main(String[] args) {
		Set a = new HashSet();
	      

		a.add(12);
		a.add(12.233);
		a.add(13);
		a.add("yamini");
		a.add(12);
		a.add(null);
		a.add(null);
		
		System.out.println("set-1 :"+ a);
		
		boolean b = a.contains("yamini");
		System.out.println(b);
		//a.clear();
		//System.out.println("clare" + a);
		System.out.println(a.isEmpty());
		a.remove(12);
		System.out.println(a);
		//a.removeAll(a);
		System.out.println(a);
		//System.out.println(a.isEmpty());
		System.out.println(a.contains(null));
		
		
	}
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("enter the value of a");
		  int a = s.nextInt();
		
		switch(a)
		{
		case 1 : System.out.println("a");
		         //continue;
		case 2 : System.out.println("b");
		         break;
		case 3 : System.out.println("c");
                  break;
        default : System.out.println("d");
 
		         
		}
	}

	/*	Scanner s = new Scanner(System.in);
		System.out.println("enter the value of a");
		   int a = s.nextInt();
		   System.out.println("enter the value of b");
		   int b = s.nextInt();
		   
		   int c = a+b;
		   System.out.println(c);
		   } */

}
