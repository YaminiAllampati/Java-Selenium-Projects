package String_Array_Concepts;

public class StringBuffer_Functions {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("yamini allampti");
		System.out.println(s);
		System.out.println();		
		//insert(int(index), String); - it used to insert the string into the exsiting string
		
		System.out.println("insert(int(index), string) : ");
		
		s.insert(7, "Pandu ");
		System.out.println(s);
		System.out.println();		

		//append(String) - to add the string at the last
 
        s.append(" testing");
        System.out.println("append() : " + s);
		System.out.println();		

		//replace(start index, end index, string)
		StringBuffer s1 = new StringBuffer("Apple 1428 ");
		System.out.println("replce(start index, end index, string) :");
		
		s1.replace(6,11, "yamin");
		System.out.println(s1);
		System.out.println();		

		//reverse(String) - it used to to reverse a string
		
		s1.reverse();
		System.out.println("String reverse : " + s1);
		System.out.println();		

		//capacity(int) & length()
		StringBuffer m = new StringBuffer("yamini");//it takes initial capacity is 16
		System.out.println("String m :" + m);
		System.out.println("length : " + m.length());
		//int f = m.capacity();
		System.out.println("capacity(int) :" +  m.capacity()); //16(initial capacity)+6(string length) = 22(total)
		System.out.println();		

	   StringBuffer s2 = new StringBuffer("yamini 1428 ");
	   System.out.println("s2 :"+ s2);
		//delete(start index, end index)
		s2.delete(2, 6);
		System.out.println("delete(start index, end index) : " + s2);
		System.out.println();		

		 
	    //ChatAt(index)
		 char c = s2.charAt(1);
		 System.out.println("charAt(index) of s2 : " + c);
		 System.out.println();		

		 //subString(int(index))
		 
		 StringBuffer k = new StringBuffer("yamini allampti");
		
		//StringBuffer k1 = k.substring(7);//                            need to check
		 
		 System.out.println("substring(int(index) :" + k.substring(7));
		 System.out.println();		

		 
		//subString(int(index), int(index))
		 
		 System.out.println("substring(int(start index), int(end index)) : " + k.substring(2,6));
		 System.out.println();	
		 
		 //
		 StringBuffer e = new StringBuffer(5);
		 System.out.println(e.capacity());
         StringBuffer k1 = e.append("yamini");
         System.out.println(k1);
		 System.out.println(k1.capacity());
		 
		 
		 
		

		 
 

		

        		 
		 
		 

	}

}
