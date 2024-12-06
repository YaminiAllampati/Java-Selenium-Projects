package CollectionsConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iterator_Concept_MapInterface {

	public static void main(String[] args) {
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("yamini", 12); //(key : value) pair
		m1.put("allam", 13);
		m1.put("pandu", 14);
		m1.put("apple", 16);
		
		System.out.println("Map -1 :" + m1);
		
		//to get only keys fro  set, we need to use for each loop
		System.out.println("Keys from Map :");
		for(String s : m1.keySet())
		{
			System.out.println(s);
		}
		//to get only values from set, we need to use for each loop
		System.out.println("Only values from Map :");
		for(int v : m1.values())
		{
			System.out.println(v);
		}
		//to get all key : values from the set
		System.out.println("Keys:values from Map :");
		for(Entry<String, Integer>  e : m1.entrySet())
		{
			System.out.println(e);
		}
		
		//By using iterator concept
		System.out.println();
		System.out.println("iterator :");
		
		 Set<Entry<String, Integer>>  s   =  m1.entrySet(); //need to check
		
		     Iterator<Entry<String, Integer>> i = s.iterator();	 //output need to check based on what values are priinting	                    
			 while(i.hasNext())
			 {
				 System.out.println(i.next());
		}
		
		

		
		
	}

}
