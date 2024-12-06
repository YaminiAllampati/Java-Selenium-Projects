package day5_day7;

public class ConstructorOverLoading {

	ConstructorOverLoading()
	{
		System.out.println("Non-para Constructor");
	}
	ConstructorOverLoading(int a)
	{
		System.out.println("Para Constructor");
	}
	ConstructorOverLoading(int a, double b)
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		//it will always execute as FIFO
		ConstructorOverLoading c = new ConstructorOverLoading(12);
		ConstructorOverLoading c1 = new ConstructorOverLoading();
		ConstructorOverLoading c2 = new ConstructorOverLoading(1,2);

	}

}
