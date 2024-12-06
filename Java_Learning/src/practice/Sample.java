package practice;

public class Sample {

	 int a,b;
	 
	/*  Sample(int x, int y) {
		 a=x;
		 b=y; */
	 
	int add(int x, int y)
	{
	 a=x;
	 b=y;//System.out.println(a+b);
	  return a+b;
	}
	 
	/* void assign(int c, int d) {
		 a=c;
		 b=d;
	 }
	 
	 }  */
	 void sub() {
		 a=12;
		 b=13;
		 System.out.println(a-b);
		 
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stu
           Sample s = new Sample();
           System.out.println(s.add(1,3));
           s.sub(); 
        
	}

}
