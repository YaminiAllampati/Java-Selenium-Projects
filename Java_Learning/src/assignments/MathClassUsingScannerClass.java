package assignments;

import java.util.Scanner;

public class MathClassUsingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the value of a :");
       int a = s.nextInt();
       System.out.println("Enter the value of b :");
       int b = s.nextInt();
      //Add of 2 two numbers
       System.out.println("Addition of number:" + (Math.addExact(a, b)));
       //Max of 2 numbers
       System.out.println("Max of 3 numbers :" + (Math.max(a, b)));
       //Multiply of 2 numbers
       System.out.println("Mutliply of 2 numbers :" + (Math.multiplyExact(a, b)));
       //absolute value
       System.out.println("Absolute value of a number :" + (Math.abs(b)));
       System.out.println("Enter the value of f :");
       double f = s.nextDouble();//need to be check
       for(int i=0; i<=2;i++)
       {
    	   double d = Math.random();
    	   System.out.println("Print the values :" + f*d);
       }
	}
	

}
