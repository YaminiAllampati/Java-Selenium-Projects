package assignments;

class Grandparents
{
	void m1()
	{
		System.out.println("GrandParents");
	}
}
class Parents extends Grandparents
{
	void m2()
	{
		System.out.println("Parents");
	}
}

public class MultipleInheritance_Singleprogram extends Parents {
	
	void m3()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		MultipleInheritance_Singleprogram m = new MultipleInheritance_Singleprogram();
		m.m1();
		m.m2();
		m.m3();
	}

}
