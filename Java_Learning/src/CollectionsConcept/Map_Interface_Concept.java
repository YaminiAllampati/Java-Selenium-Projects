package CollectionsConcept;

import java.util.HashMap;
import java.util.Map;
/** Map interface Properties **/
/*it doesnot follow indexing
* it stores the heterogenous elements in (key : value) pair
* it doesnt allow duplicates in keys but allows mutilple in value
* it allow only single null in key but allows mutilple nulls in value
* it will not sorting(Collections.sort() method - need to check
* it doesnot allow insertion order, since no indexing followed
* it will be dynamic in nature
* we wil use put() method to add the values to the map
*/

public class Map_Interface_Concept {

	public static void main(String[] args) {
            
		Map m = new HashMap();
		
		m.put("yamini", 12); //(key : value) pair
		m.put("allam", 13);
		m.put("pandu", 14);
		m.put("yamini", 12); //it will not allows duplicate keys
		m.put("apple", 13); //it will allows duplicate values
		m.put("Mango", null);//it will allows only single null value
		m.put("banana", null);
		m.put(null,  19); //it allows only single null in key
		m.put(null,  12);//
		
		System.out.println("Map -1 :" + m);
		
		//to erase the yellow lines
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("yamini", 12); //(key : value) pair
		m1.put("allam", 13);
		m1.put("pandu", 14);
		m1.put("apple", 16);
		
		System.out.println("Map -2 :" + m1);
		
	}

}
