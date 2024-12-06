package CollectionsConcept;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
   /** Set interface Properties **/
/*it doesnot follow indexing
 * it stores the heterogenous elements
 * it doesnt allow duplicates
 * it allow only single null
 * it will not sorting(Collections.sort() method - need to check
 * it doesnot allow insertion order, since no indexing followed
 * it will be dynamic in nature
 */

public class Set_Interface_Properties {

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
		
		Set b = new HashSet();

		b.add(12);
		b.add(1);
		b.add(44);
		System.out.println("Set-2 :" + b);
		//Collections.sort(b); - we cant br able to perfrom sort with function
		//System.out.println("After Sorting :" + b);
		
		Iterator i = b.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 
		

	}

}
