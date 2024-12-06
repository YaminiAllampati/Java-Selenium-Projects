package String_Array_Concepts;

import java.util.Arrays;

public class StringFunctionsConcept {

	public static void main(String[] args) {
		
		String s1 = "yamini";
		String s2 = "allampati";
		String s3 = "YAMini";
		String s4 = "yamini";
		
		
		//equals()
		System.out.println("Equals() function :");
		boolean b1 = s1.equals(s4);
		boolean b2  = s1.equals("Reddy");
		boolean b6  = s1.equals(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		
		//equalsIgnoreCase()
		System.out.println("EqualsIgnoreCase() function :");
		boolean b3 = s1.equalsIgnoreCase(s3);
		boolean b4  = s1.equalsIgnoreCase(s2); 
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();
		
		//concat()
		System.out.println("Concate() function :");
		String s7= s1.concat(s2);
		String s8= s1.concat(" ").concat("Reddy").concat(" ").concat(s2);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s1+" "+ s2); // 2 type for concatation by using addition operator
		System.out.println();
				
        //replace(char, Char) & replace(String, String)
		
		System.out.println("replace() function :");
		String n = "Yamini 28 Allam14";
		String n1= n.replace('A', 'h');
		String n2= n.replace("28","reddy");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println();
		
		 //replaceAll()

		System.out.println("replaceAll() function :");
		String m = "Yamini 28 Allam14 Cts";
		String m1= m.replaceAll("[0-9]", "");
		String m2= m.replaceAll("[a-z]","");
		String m3= m2.replaceAll("[A-Z]", "").replace("28", "Pandu");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println();
		
		//contains
		System.out.println("contains() function :");
		boolean b =  m.contains("mini");
		System.out.println(m.contains("pandu"));
		System.out.println(b);
		System.out.println();
		
		/*matchs()
		 * check if the given string ends with 'l' in school -->sytanx -->("(.*)char name)
		 * 	it will only check whether the string is ends with l or not.
		 * it is a multi character search
		 * though we have multiple words in a string - it comes under a single string like String d */
		System.out.println("matches() function with ending character:");
		String c = "school";
		String d = "She is looking too cool today";
		boolean b8 = c.matches("(.*)l");
		System.out.println(b8);
		System.out.println(d.matches("(.*)l"));
		
		System.out.println("matches() function with starting character:");
		String d1 = "leela";
		String d2 = "playing with lemon"; //starting chara is not with letter l, even spaces also countables as a character in string concept
		boolean b9 = d1.matches("l(.*)");
		System.out.println(b9);
		System.out.println(d2.matches("l(.*)"));
		
		System.out.println("matches() function for any character in generic way:");
		
		String d3 = "My name is yamini";
		boolean b7 = d3.matches("(.*)a(.*)");
		System.out.println(b7);
		System.out.println(d3.matches("(.*)l(.*)"));
		System.out.println();
		
		//charAt(index)
        System.out.println("charAt(index) function:");
		String d6 = "My name is yamini";
		char k = d6.charAt(4);
		System.out.println(k);
		System.out.println();
		
		//indexOf(char)
		 System.out.println("indexOf(char) function:");
		 String g = "yamini";
			int k1 = g.indexOf('i');
			System.out.println(k1);
			System.out.println();
			
		
			
			//repeat()
	  System.out.println("repeat(int) function:")	;
	  String h = "yamini";
	  String  g1 = h.repeat(3);
	  System.out.println(g1);
	  System.out.println();
	  
	  //split(char),split(char, int)  --> it is used to split the string into a string array
	  System.out.println("split() function:");
	  String s9 = "yamini allampati Pandu 1428";
	  String d9[]=s9.split(" ");
	  String d7[]=s9.split("a");  
	  System.out.println(Arrays.toString(d9));
	  System.out.println(Arrays.toString(d7));
	  
	  String d61[] = s9.split("i", 6);//need to check
	  
	  System.out.println(Arrays.toString(d61));
	  
	  
	  
	  
	  
	  
	  
		
		
		
		
	}

}
