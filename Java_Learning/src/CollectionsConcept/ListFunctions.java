package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFunctions {

	public static void main(String[] args) {
		
		//Add() fucntion - it used to add single element into the list
		//addAll() - it used to add the collection(list) to the newlist
		

		   List l1 = new ArrayList();
		   l1.add(13);
		   l1.add("String");
		   l1.add('a');
		   l1.add(23);
		   System.out.println("list 1:" + l1);
		   
		   List l2 = new ArrayList();
		   l2.add(3);
		   l2.add("yam");
		   l2.addAll(l1);
		   System.out.println("list 2:" + l2);
		   
		   //equal
		   
		   boolean p = l1.equals(l2);
		   System.out.println("equals :"+ p);
		   
	      //remove() function - it used to remove single element from the list
		   l2.remove(2);
		   System.out.println("after removing :" + l2);
		   
		   System.out.println(l1.equals(l2));
		   
		   
		 //removeAll() function - it used to remove whole list  
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
		   
		    
	}

}
