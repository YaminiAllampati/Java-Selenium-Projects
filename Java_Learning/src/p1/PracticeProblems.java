package p1;

import java.util.InputMismatchException;

public class PracticeProblems {

	public static void main(String[] args) throws NullPointerException,InputMismatchException {
         if(1==2)
         {
		throw new NullPointerException("Testing...");
	}
         else
         {
        	 throw new InputMismatchException("Testing123");
         }

}
}
