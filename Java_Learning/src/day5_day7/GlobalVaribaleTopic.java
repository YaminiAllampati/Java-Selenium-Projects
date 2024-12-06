package day5_day7;

public class GlobalVaribaleTopic {
	
	final static int a = 12; //final static
     final int b =10; //final non- static
     int c = 20; //non-static
     static int d = 13; //static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		GlobalVaribaleTopic g = new GlobalVaribaleTopic();
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(d);
		//value of update static & Non-static variables
		System.out.println(g.c=17); 
		System.out.println(d=22);
		//values cannot be updated for final static & Non-static variables
		//System.out.println(g.b=17);
		//System.out.println(a=22);

	}

}
