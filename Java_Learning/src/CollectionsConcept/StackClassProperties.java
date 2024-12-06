package CollectionsConcept;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackClassProperties {

	public static void main(String[] args) {
		//Class -1
		 Stack a = new Stack();
		    a.add(12);
			a.add(12.233);
			a.add(13);
			a.add("yamini");
			a.add(12);
			a.add(null);
			a.add(null);
			System.out.println(a);
		//class - 2
			Stack b = new Stack();
			b.add(12);
			b.add(1);
			b.add(44);
			System.out.println("Before Sorting :" + b);
			Collections.sort(b);
			System.out.println("After Sorting :" + b);
			
			System.out.println("Iterator for class - b :");
			Iterator i = b.iterator();
			 while(i.hasNext())
			 {
				 System.out.println(i.next());
			 }
			 

			System.out.println("ListIterator for class - b :");
			 
			 ListIterator l = b.listIterator();
			 
			 while(l.hasNext())
			 {
				 System.out.println(l.next());
			 }
			 while(l.hasPrevious())
			 {
				 System.out.println(l.previous());
			 }
	
			 Stack b1 = new Stack();
				b1.add(12);
				b1.add(1);
				b1.add(44);
				b1.add(78);
				b1.add(5);
				
				System.out.println(b1);
				
			Enumeration e1=	b1.elements();
				
				while(e1.hasMoreElements())
				{
					System.out.println(e1.nextElement());
				}
				
				
}
}
