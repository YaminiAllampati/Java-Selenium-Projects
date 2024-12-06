package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class VectorClassProperties {

	public static void main(String[] args) { 
		
   // List a = new Vector(); - cant we able to access the arraylist method here?
      Vector a = new Vector();

      

		a.add(12);
		a.add(12.233);
		a.add(13);
		a.add("yamini");
		a.add(12);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
	   Vector b = new Vector();
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
		 while(l.hasNext())
		 {
			 System.out.println(l.previous());
		 }
	
			
		


	}

}
