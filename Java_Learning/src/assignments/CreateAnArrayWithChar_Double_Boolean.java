package assignments;

public class CreateAnArrayWithChar_Double_Boolean {

	public static void main(String[] args) {
		
		double a[] = new double[3];
		a[0] = 12.347998;
		a[1] = 77.898797;
		a[2] = 8.9898876787;
		System.out.println("Array with double datatype :");
		for(int i=0; i<3; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Array with char datatype :");
		char a1[] = new char[4];
		a1[0] = 'a';
		a1[1] = 'y';
		a1[2] = 'm';
		a1[3] ='i';
		for(int i=0; i<4; i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println("Array with boolean datatype :");
		boolean a2[] = new boolean[2];
		a2[0] = true;
		a2[1] = false;
		for(int i=0; i<2; i++) //index - 0,1
		{
			System.out.println(a2[i]);
		}
		
		
		
		

	}

}
