package p2;

import p1.Class1;

//import p1.Class1;

public class Class2 extends Class1 {

	public static void main(String[] args) {
		
		/*Class1.m1();
		Class1 c = new Class1();
		c.m6();
		m3();
		c.m8(); //need to check - cant be able to call the protected method in outside package by coming subclass */
		Class2 c = new Class2();
		c.m8();
		c.m6();
		c.m1();
		c.m3();

	}

}
