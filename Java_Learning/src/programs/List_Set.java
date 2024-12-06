package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Set {

	public static void main(String[] args) {

		List a = new ArrayList();
		a.add(1);
		a.add(6);
		a.add(3);
		a.add(4);
		a.add(7);
		a.add(6);
		a.add("ubn");
		
		
		
		//Collections.sort(a);
		
		System.out.println(a);
		a.remove("ubn");
		System.out.println(a);
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
       ListIterator j = a.listIterator();
		
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
		while(j.hasPrevious())
		{
			System.out.println(j.previous());
		}
		
		
		
		
	}

}
