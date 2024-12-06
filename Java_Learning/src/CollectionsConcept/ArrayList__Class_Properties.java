package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList__Class_Properties {

	public static void main(String[] args) {

		
		ArrayList a = new ArrayList();
		
		a.add(12);
		a.add(12.233);
		a.add(13);
		a.add("yamini"); 
		a.add(12);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		ArrayList b = new ArrayList();
		b.add(12);
		b.add(1);
		b.add(44);
		System.out.println("Before Sorting :" + b);
		Collections.sort(b);
		System.out.println("After Sorting :" + b);
		
		Iterator i = b.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 
		 ListIterator l = b.listIterator();
		 
		 while(l.hasNext())
		 {
			 System.out.println(l.next());
		 }
		 while(l.hasPrevious())
		 {
			 System.out.println(l.previous());
		 }
	
	}

}
