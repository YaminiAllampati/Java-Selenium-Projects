package practice;

import java.util.Scanner;

public class AreaOfShapesUsingScannerClass {
		static double pi = 3.14;
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the radius : ");
			int r = s.nextInt();
			double circle = pi*r*r;
			System.out.println("Area of circle : " + circle);
			//area of rectangle
			System.out.println("Enter the breath : ");
			int b = s.nextInt();
			System.out.println("Enter the length : ");
			int l1 = s.nextInt();
			int rect = b*l1;
			System.out.println("Area of rectangle :" + rect);
			System.out.println("Enter the side : ");
			int s1 = s.nextInt();
			int square = s1*s1;
			System.out.println("area of squre : " + square);
			System.out.println("Enter the height : ");
			int h = s.nextInt();
			double tri = 0.5*(h*h);
			System.out.println("Area of triangle : " + tri);
			System.out.println("Enter the length2 : ");
			int l2 = s.nextInt();
			double trip =  0.5*(l1+l2)*h;
			System.out.println("are of tripezium : " + trip);
			
			
			
			
			
			

	}

}
