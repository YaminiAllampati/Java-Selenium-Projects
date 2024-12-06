package p1;

import java.util.Date;

public class Practice2 {

	public static void main(String[] args) {

		
		Date d = new Date();
		
		System.out.println(d.getTime());
		
		Date d2  = new Date(d.getTime());
		System.out.println(d2);
		
		
		
		//find ayear
		
		String s = d2.toString();
		System.out.println("length :" + s.length());
		
		String year = s.substring(0);
		
		System.out.println();
		}

}
