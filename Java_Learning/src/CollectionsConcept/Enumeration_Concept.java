package CollectionsConcept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

//** Enumeration **//
/* Enumeration is applicable for only legacy classes i.e vector, stack..etc
*  Enumeration -->returns Enumeration but it will read by elements() method
*  syntax : Enumeration e = i.elements()
* it has methods like hasMoreElements(); nextElement();
* It is used for to retrieve the elements from forward direction.
*/

public class Enumeration_Concept {

	public static void main(String[] args) {

		 Vector a = new Vector();
		  
		    a.add(12);
			a.add(12.233);
			a.add(13);
			a.add("yamini");
			a.add(12);
			a.add(null);
			a.add(null);
			
			System.out.println("Vector class Values :" + a);
			
			System.out.println("Enumeration :");
			
			Enumeration e =  a.elements();
			
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
	}
	
	    

}
