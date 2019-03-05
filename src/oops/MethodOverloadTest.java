package oops;

public class MethodOverloadTest {

	public void Addition(int a, int b)  
	{
		int c =a+b;
		System.out.println("Addition of integer a and b is : " + c);
	}
	
	public void Addition(int a, int b, int c)  
	{
		int d =a+b+c;
		System.out.println("Addition of integer a and b and c is : " + d);
	}
	
	
	public void Addition(double a, double b)  
	{
		double c =a+b;
		System.out.println("Addition of double a and b is : " + c);
	}
	

	
	public static void main(String[] args) {
		MethodOverloadTest mt = new MethodOverloadTest(); // Create object for a class, object name is am
		mt.Addition(12.4564, 456.567567);
	
	}

}
