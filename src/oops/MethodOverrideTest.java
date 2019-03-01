package oops;

public class MethodOverrideTest extends MethodOverloadTest{

	public void Addition(int a, int b)  
	{
		int c =a+b;
		System.out.println("Addition of integer a and b in sub class is : " + c);
	}
	
	public static void main(String[] args) {
		MethodOverrideTest mo = new MethodOverrideTest(); // Create object for a class, object name is am
		mo.Addition(10, 20);
		
	
	}

}
