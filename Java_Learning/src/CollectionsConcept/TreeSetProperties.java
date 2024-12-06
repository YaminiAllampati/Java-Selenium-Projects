package CollectionsConcept;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProperties {

	public static void main(String[] args) {
		
		TreeSet a = new TreeSet();
	      

		a.add(12);
		a.add(12.23);
		a.add(13);
		a.add("yamini");
		a.add(12);
		a.add(null);
		a.add(null);		
		System.out.println("set-1 :"+ a);
		
		TreeSet b = new TreeSet();

		b.add(12);
		b.add(1);
		b.add(44);
		System.out.println("Set-2 :" + b);
		//Collections.sort(b); //- we cant br able to perfrom sort with function
		//System.out.println("After Sorting :" + b);
		
		Iterator i = b.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 
	}

}

