package programs;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String332 {

	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
			
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
			
			
			System.out.println();
			
           
			for(String s : m1.keySet())
			{
				System.out.println(s);
			}
			for(int s1 : m1.values())
			{
				System.out.println(s1);
			}
			for(Entry<String,Integer> s2 : m1.entrySet())
			{
				System.out.println(s2);
			}
			
			    Set<Entry<String,Integer>> n=m1.entrySet();
			    Iterator<Entry<String,Integer>>   i =n.iterator();
			    while(i.hasNext())
			    {
			    	System.out.println(i.next());
			    }
		
	}
	
	}
		
	/*	String s1 ="ram";
		String s2 = "arm";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b = Arrays.equals(c1, c2);
		
		if(b==true)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram");
		


		}
	}
	}
		
	/*	String s = "yamini @#$! 12543";
		int alpha=0;
		int num=0;
		int sp=0;
		char c[] = s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		 for(int i =0; i<c.length;i++)
		 {
			      boolean b =Character.isLetter(c[i]);
			      if(b==true)
			      {
			    	  alpha = alpha+1;
			      }
			      
		 }
		 for(int i =0; i<c.length;i++)
		 {
			      boolean b =Character.isDigit(c[i]);
			      if(b==true)
			      {
			    	  num = num+1;
			      }
			      
		 }
		 
		 for(int i =0; i<c.length;i++)
		 {
			      boolean b =Character.isWhitespace(c[i]);
			      if(b==true)
			      {
			    	  sp = sp+1;
			      }
			      
		 }
		 
		 System.out.println(alpha);
		 System.out.println(num);
		 System.out.println(sp);
		 
			int spchar= (alpha+num+sp)/3;
			System.out.println(spchar);
		
		
	}
	}
		
		
	/*	Date d = new Date();
		System.out.println(d.getTime());
		
		Date d1 = new Date(d.getTime() + (1000*60*60*24*2));
		System.out.println(d1);
		
		String s2 = d1.toString();
		System.out.println(s2);
		
		//date
		String date = s2.substring(8, 10);
		System.out.println(date);
		//day
		 System.out.println(s2.length());
		System.out.println(s2.substring(s2.length()-4, s2.length()));
		//
		
		
		
	}
	}

	/*	String s ="ini";
		String s1 ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			      char ch =s.charAt(i);
			      s1 = s1+ch;
			      
		}
	      System.out.println(s1);

	     if(s.equals(s1))
	     {
	    	 System.out.println("palindrome");
	     }
	     else
	     {
	    	 System.out.println("not a plain");
	     }
	}

} */
