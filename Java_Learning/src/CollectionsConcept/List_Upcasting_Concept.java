package CollectionsConcept;

import java.util.ArrayList;

/** List interface Properties **/
/*it  follows indexing
* it stores the heterogeneous elements
* it allow duplicates
* it allow multiple null
* it allow sorting
* it follow insertion order, since indexing is followed
* it will be dynamic in nature
*/

import java.util.List;

public class List_Upcasting_Concept {

	public static void main(String[] args) {
       
		List a  =  new ArrayList();
		
		a.add(12);
		a.add("yamini");
		a.add(2.2342);
		a.add(1234323);
		a.add(null);
		a.add('d');
		a.add(12);
		a.add(1);
		a.add(null);
		a.add(true);
		
		
		System.out.println(a);
		System.out.println("length :" + a.size());
				
	}

}
