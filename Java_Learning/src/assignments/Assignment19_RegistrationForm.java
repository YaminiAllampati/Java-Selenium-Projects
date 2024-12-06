package assignments;

import java.util.Scanner;

public class Assignment19_RegistrationForm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname = s.next();
		System.out.println("Enter the last name");
		String lname = s.next();
		System.out.println("Enter the email address");
		String email = s.next();
		System.out.println("Enter the password");
		String pswrd = s.next();
		System.out.println("Enter the pincode");
		int pincode = s.nextInt();
		System.out.println("Enter the gender");
		char gender = s.next().charAt(0);
		System.out.println("Enter the address");
		String paddress = s.next();

	}

}
