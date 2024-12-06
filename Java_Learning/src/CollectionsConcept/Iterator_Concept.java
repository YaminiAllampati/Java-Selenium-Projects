package CollectionsConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/** Iterator **/
/* iterator is applicable for entire collection
 * iterator -->returns iterator
 * it has methods like hasNext(); next(); remove()
 * It is only used for to retrieve the forward elements
 */
public class Iterator_Concept {
	
public static void main(String[] args) {
	//List
	  List a = new ArrayList();
	  
	    a.add(12);
		a.add(12.233);
		a.add(13);
		a.add("yamini");
		a.add(12);
		a.add(null);
		a.add(null);
		
		System.out.println("list Values :" + a);
		
		System.out.println("Iterator :");
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	// set	
		 Set b = new HashSet();
		  
		    b.add(12);
			b.add(12.233);
			b.add(13);
			b.add("yamini");
			b.add(12);
			b.add(null);
			b.add(null);
			
			System.out.println("Set Values :" + b);
			
			System.out.println("Iterator :");
			
			Iterator j = b.iterator();
			
			while(j.hasNext())
			{
				System.out.println(j.next());
			}
			
		
		

		
		
	}

}
