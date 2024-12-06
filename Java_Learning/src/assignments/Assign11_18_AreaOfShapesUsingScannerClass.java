package assignments;

import java.util.Scanner;

public class Assign11_18_AreaOfShapesUsingScannerClass {
	
	static double pi = 3.14;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int r = s.nextInt();
		System.out.println("Enter the breath : ");
		int b = s.nextInt();
		System.out.println("Enter the length1 : ");
		int l1 = s.nextInt();
		System.out.println("Enter the side : ");
		int s1 = s.nextInt();
		System.out.println("Enter the height : ");
		int h = s.nextInt();
		System.out.println("Enter the length2 : ");
		int l2 = s.nextInt();
		//area of circle
		double circle = pi*r*r;
		System.out.println("Area of circle : " + circle);
		//area of rectangle
		int rect = b*l1;
		System.out.println("Area of rectangle :" + rect);
		//are of square
		int square = s1*s1;
		System.out.println("area of squre : " + square);
		//are of triangle
		double tri = 0.5*(h*h);
		System.out.println("Area of triangle : " + tri);
		//area of tripezium
		double trip =  0.5*(l1+l2)*h;
		System.out.println("are of tripezium : " + trip);
		//Circumference of circle
		double cc = 2*pi*r;
		System.out.println("Circumference of circle : " + cc);
		//Circumference of rectangle
		int cr = 2*(l1+b);
		System.out.println("Circumference of circle : " + cr);
		//Circumference of square
		int cs = 4*s1;
		System.out.println("Circumference of square : " + cs);	

	}

}
