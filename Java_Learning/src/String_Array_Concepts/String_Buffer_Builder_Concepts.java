package String_Array_Concepts;


//String, StringBuffer, StringBuilder --> all will comes from "java.lang" package
//all 3 will follows indexing
/** String **
 * String s = new String("Yamini") --> parameterized constructor(Creating object for AString class, by passing it values inside it.)
 * String is immutable in nature
 * We can't be able change/update the values, it always remain same, 
 * until we stores in separate variable
 * we use concat() method to add the to strings
 */
/** String Buffer **
 * the intial capacity of StringBuffer is 16
 * StringBuffer s = new StringBuffer("Yamini") --> parameterized constructor
 * StringBuffer is mutable in nature
 * We can be able change/update the values of String, without assign to any var
 * we use append() method to add the to stringBuffers
 */
/** String Builder **
 * StringBuilder s = new StringBuilder("Yamini") --> parameterized constructor
 * StringBuilder is mutable in nature
 * We can be able change/update the values of String, without assign to any var
 * we use append() method to add the to stringBuilders
 */

public class String_Buffer_Builder_Concepts {

	public static void main(String[] args) {
		
		
		
		System.out.println("String concept :");
//declaring the string in 2 ways :
	//way - 1
		String s = "Pandu";
		System.out.println(s);
	//way - 2	
		String s1 = new String("Yamini");
		System.out.println(s1);
		
		s1.concat("Allampati");
		System.out.println(s1);//output --> yamini
		
		String a = s1.concat("Allampati");
		System.out.println(a);//Yamini Allampati
		
		System.out.println();
		
	System.out.println("String Buffer concept :");
	//declaring the stringBuffer in 2 ways :
	    //way - 1
	//StringBuffer p = "Pandu";                               //need to check
        //	System.out.println(s);
		//way - 2	
		StringBuffer s2 = new StringBuffer("Yamini");
		System.out.println(s2);
				
		s2.append("Allampati");
	    System.out.println(s2);//output --> yamini
				
			
		System.out.println();
		
	System.out.println("String Builder concept :");
		//declaring the stringBuffer in 2 ways :
		    //way - 1
		//StringBuilder k = "Pandu";
	        //	System.out.println(s);
			//way - 2	
			StringBuilder s3 = new StringBuilder("Yamini");
			System.out.println(s3);
					
			s3.append("Allampati");
		    System.out.println(s3);//output --> yamini
					
				
			System.out.println();
	}

}
