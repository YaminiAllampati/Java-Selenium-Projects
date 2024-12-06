package p2;

/* int, short, long, byte --> returns - 0
 * float, double --> returns - 0.0
 * String --> return - Null
 * boolean --> return - false
 * Char --> Not defined
 * global variable can be only re-intilize locally
 */

public class GloablVar2 {
	
	static byte a;
	static short b;
	static int c;
	static long d;
	float e;
	double f;
	boolean g;
	String s;
	
	public static void main(String[] args) {
		
		System.out.println("byte :" + a);
		System.out.println("short :" + b);
		System.out.println("int :" + c);
		System.out.println("long :" + d);
		GloablVar2 v = new GloablVar2();
		System.out.println("float :" + v.e);
		System.out.println("double :"+ v.f);
		System.out.println("boolean :" + v.g);
		System.out.println("String value :" + v.s);
		
		
		
		

	}

}
