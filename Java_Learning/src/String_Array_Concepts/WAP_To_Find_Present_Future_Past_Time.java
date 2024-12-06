package String_Array_Concepts;

import java.util.Date;

/* we have a date class to find out the time */


public class WAP_To_Find_Present_Future_Past_Time {

	public static void main(String[] args) {
		
		//crate an object of date class
		Date d1 = new Date();//non-para cons
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime() - (1000*60*60*24*3)); //para cons - it will go to the para cons
		//it will give the human understanble time
		System.out.println(d2);
				
		
		//convert the d2 into string by using toString() - method
		
		String s1 = d2.toString();
		System.out.println("String :" + s1);
		
		//find out the year from d2
		
		String year = s1.substring(s1.length()-4);
		System.out.println(year);
		
		//find out the month
		
		String month = s1.substring(4,7);
		System.out.println(month);
		

		//find out the date
		
		String date = s1.substring(8,10);
		System.out.println(date);
		
		//print 27/aug/2024
		String c = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(c);
		
		
		

		


	}

}
