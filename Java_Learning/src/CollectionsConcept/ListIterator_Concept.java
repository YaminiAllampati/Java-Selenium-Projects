package CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//** ListIterator **//
/* iterator is applicable for only List interface and its classes
 * Listiterator -->returns Listiterator
 * it has methods like hasNext(); next(); previous(); remove();
 * It is used for to retrieve the elements from forward & backward direction.
 * Reverse iteration will be possible only after the forward iteration
 */
import java.util.ListIterator;

public class ListIterator_Concept {

	public static void main(String[] args) {
		
			  List a = new ArrayList();
			  
			    a.add(12);
				a.add(12.233);
				a.add(13);
				a.add("yamini");
				a.add(12);
				a.add(null);
				a.add(null);
				//a.(12);
				
				System.out.println("list Values :" + a);
				
				System.out.println("ListIterator :");
				
				ListIterator i = a.listIterator();
				
				System.out.println("Print values present in a forward direction using next() function :");
				
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				
	           System.out.println("Print values in a backward direction using previous() function :");
				
				while(i.hasPrevious())
				{
					System.out.println(i.previous());
				}

				
				
			}
		

	


	}

