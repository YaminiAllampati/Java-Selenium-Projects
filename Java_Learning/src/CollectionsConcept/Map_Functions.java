package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Functions {

	public static void main(String[] args) {
       
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("yamini", 12); //(key : value) pair
		m1.put("allam", 13);
		m1.put("pandu", 14);
		m1.put("apple", 16);
		m1.put("mango", 18);
		m1.put("banana", 20);
		
		System.out.println("Map -1 :" + m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("cat", 6); //(key : value) pair
		m2.put("bat", 8);
		m2.put("dog", 9);
		m2.put("ball", 7);	
		System.out.println("Map -2 :" + m2);
		
		
		Map<Integer, Integer> m3 = new HashMap<Integer, Integer>();
		m3.put(9, 12); //(key : value) pair
		m3.put(1, 13);
		m3.put(2, 14);
		m3.put(3, 16);
		m3.put(4, 18);
		m3.put(6, 20);
		
		System.out.println("Map -3 :" + m3);
		
		//putAll() - to concat the one to another map
		System.out.println("putAll() method :");
		m1.putAll(m2);
		System.out.println(m1);
		
		//putifAbsent() - to insert new value
	    m1.putIfAbsent("abc", 12);
		System.out.println(m1);
		
		
		  //remove(key) function - it used to remove single element from the Map by using key
		   System.out.println("remove(key) method :");
		   m2.remove("bat");
		   System.out.println("after removing :" + m2);
		   
		   //remove(key, value) function - it used to remove single element from the Map4		System.out.println("putAll() method :");
			System.out.println("remove(key, value) method :"); 
		   m2.remove("dog", 9);
		   System.out.println("after removing :" + m2);
		   
		 //removeAll() - to remove the whole map from another map - it not present
		   
		   
		   //size() - to get the size of the map
		   System.out.println("Map size :" + m1.size());
		   
		   
		  //containsKey() - it returns boolean value
		   System.out.println("ContainsKey() method:");
		  boolean b1 =  m1.containsKey("pandu");
		  System.out.println(b1);	  
		  System.out.println(m1.containsKey("rat"));
		   
		  //containsValue() - it returns boolean value
		   System.out.println("ContainsValue() method:");
		  boolean b2 =  m1.containsValue("88");
		  System.out.println(b2);	  
		  System.out.println(m1.containsValue(20));
		  
		  
		  //equals()
		  System.out.println("equals() :");
		  System.out.println(m1.equals(m2));
		  
		  //clear() 
		  System.out.println("clear() method : ");
		  m3.clear();
		  System.out.println(m3);
		  
		  //isEmpty()
		  System.out.println("isEmpty() method : ");
		  System.out.println(m3.isEmpty());
		  System.out.println(m2.isEmpty());
		  
		  
		  System.out.println("Keys from Map :");
			for(String s : m2.keySet())
			{
				System.out.println(s);
			}
			//to get only values from set, we need to use for each loop
			System.out.println("Only values from Map :");
			for(int v : m2.values())
			{
				System.out.println(v);
			}
			//to get all key : values from the set
			System.out.println("Keys:values from Map :");
			for(Entry<String, Integer>  e : m2.entrySet())
			{
				System.out.println(e);
			}
		  
		  
		  
		   
		   
		   
		   
		   
		/* //removeAll() function - it used to remove whole list  
		   l2.removeAll(l1);
		   System.out.println("after remving the whole l1 list :" + l2);
		   
		   //size() - to get the size of the list
		   System.out.println("list size :" + l2.size());
		   
		   //contains() - it returns boolean value
		   boolean b = l2.contains("yamini");
		   System.out.println("Contains functions:"+ b);
		   
		   List l3 = new ArrayList();
		   
		   System.out.println("Isempty():"+ l3.isEmpty());
		   
		   //Collections.sort() - it used to sort the elements,and it will when all the elements in a list are same
		   List l4 = new ArrayList();
		    l4.add("yamini");
		    l4.add("bhvana");
		    l4.add("cat");
		    Collections.sort(l4);
		    System.out.println("after sorting :"+ l4);
		    
		    
		    //clear() - clear the values in a list
		    
		    l4.clear();
		    System.out.println("after clearing :" + l4);
		    
		    //get() - get the values from the list
		    
		    System.out.println(" get(index) : " + l1.get(2));
		    
		    //insert the new value into the list
		    
		    l1.add(2, "hema");
		    System.out.println("insert - add(index, object) : " + l1);
		    
		    
		    //set() to replace  the existing value in a list
		    
		    l1.set(0, 99);
		    System.out.println("set() : " + l1);
		    
		    //indexOf() - to get the value based on index
		    
		   int a = l1.indexOf("hema");
		    System.out.println("indexOf() of hema is : " + a);
		*/   
		    
		
	}

}
