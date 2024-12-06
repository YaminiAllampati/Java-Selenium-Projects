package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class MapInterators {

	public static void main(String[] args) {
		

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("yamini", 12); //(key : value) pair
		m1.put("allam", 13);
		m1.put("pandu", 14);
		m1.put("apple", 16);
		
		System.out.println("Map -2 :" + m1);
		
		for (String k : m1.keySet())
		{
			System.out.println(k);
		}

		for (int i : m1.values())
		{
			System.out.println(i);
		}

		for (Entry<String, Integer> e : m1.entrySet())
		{
			System.out.println(e);
		}
		
		
		     Set<Entry<String, Integer>>  m  = m1.entrySet();
		     
		          Iterator<Entry<String, Integer>> i = m.iterator();
		          
		          while(i.hasNext())
		          {
		        	  System.out.println(i.next());
		          }
		
	}
}