package p1;

import programs.AccessSpecifiers;

public class AccesSp2 extends AccessSpecifiers {

	public static void main(String[] args) {

		AccessSpecifiers.m1();
		AccessSpecifiers a = new AccessSpecifiers();
		a.m5();//public
		
		m1();
		m4();		
	}

}
