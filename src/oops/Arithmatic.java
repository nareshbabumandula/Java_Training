package oops;

public class Arithmatic {

	int a=10; // Characteristics or attributes or state of an object
	int b=20;
	
	public void Addition()  // Behavior or action
	{
		int c =a+b;
		System.out.println("Addition of a and b is : " + c);
	}
		
	public void Substraction()  // Behavior or action
	{
		int c =a-b;
		System.out.println("Substraction of a and b is : " + c);
	}
	
	public void Multiplication()  // Behavior or action
	{
		int c =a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}
	
	// Constructor
	public Arithmatic() {
		System.out.println("Welcome to oops training");
	}
	
	public static void main(String[] args) {
		
	//  Classname objname = new Constructor name
		Arithmatic am = new Arithmatic(); // Create object for a class, object name is am
		System.out.println(am.a);
		System.out.println(am.b);
		am.Addition();
		am.Substraction();
		am.Multiplication();
	}

}
