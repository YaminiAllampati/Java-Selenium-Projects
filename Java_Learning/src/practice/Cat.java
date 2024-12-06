package practice;

public class Cat {
	//Write a Java program to create a class called "Cat" with instance variables name and age. 
	//Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
	
   String name;
   int age;
 
	/* Cat()
	{
		 name = "Unknown";
		 age = 0;
	} */
	Cat(int a)
	{
		System.err.println(a);
	}
	Cat(String x, int y)
	{
		name =x;
		age =y;
	}
	void m1()
	{
		System.out.println(name + " "+ age);
	}
	

	public static void main(String[] args) {
		
		Cat c = new Cat(1);
		
		c.m1();

	//	c1.m1();
		
		
		
	}

}
