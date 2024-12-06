package day5_day7;

public class UpadtingGlobalVariable {
         static int b = 12;
         int c =11;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//before updating
		System.out.println(b);
		UpadtingGlobalVariable u = new UpadtingGlobalVariable();
		System.out.println(u.c);
		//after updating
		b = 14;
		System.out.println(b);
		u.c = 17;
		System.out.println(u.c);
		
		

	}

}
