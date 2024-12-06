package practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorPrcatice {

	public static void main(String[] args) {

		

		Vector a = new Vector();
		
		a.add(12);
		a.add(12.233);
		a.add(13);
		a.add("yamini"); 
		a.add(12);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		  Iterator i = a.iterator();
		  
		  while(i.hasNext())
		  {
			  System.out.println(i.next());
		  }
		  
		ListIterator l =   a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		System.out.println("ee");
		
		  Enumeration e =  a.elements();
		  
		  while(e.hasMoreElements())
		  {
			  System.out.println(e.nextElement());
		  }
		
	}

}
