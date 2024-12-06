package vivaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListOfLierator {

	public static void main(String[] args) {

		List a = new ArrayList();
		
		a.add(12);
		a.add("yamini");
		a.add(23);
		a.add("apple");
		
		System.out.println(a);
		
		      ListIterator li=a.listIterator();
		      while(li.hasNext())
		      {
		    	  System.out.println(li.next());
		      }
		      while(li.hasPrevious())
		      {
		    	  System.out.println(li.previous());
		      }
	}

}
