package Selenium_Practice;

import java.util.Date;

public class ActionsClassConcept {

	public static void main(String[] args) {

	Date d1 = new Date();
    System.out.println(d1.getTime());
    
    Date d2 = new Date(d1.getTime());
    System.out.println(d2);
    
    String s = d2.toString();
    System.out.println(s);
    
    String time = s.substring(11, 19).replace(":", "-");
    System.out.println(time);
    
	}

}
