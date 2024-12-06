package p2;

//overriding - creating the same method in child class as parent class but diff in implementation(body of the method)
//its only used for non-static methods
//super keyword - to print the overridden/suppressed method by declaring in child class 
class Parent2 
{
	static void m1(int a )
	{
		System.out.println("method1");
	}	
}
 class Overriding_Concept1 extends Parent2
{
	static void m1(int a)
	 {
		 System.out.println("method2");
		 //super.m1(2);  //super keyword
	 }

	public static void main(String[] args) {
		
		//Overriding_Concept1 o = new Overriding_Concept1();
		//o.m1(1);
		m1(1);
		
		
		
	}

}
