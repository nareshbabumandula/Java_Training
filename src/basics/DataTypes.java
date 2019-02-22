package basics;

public class DataTypes {

	public static void main(String[] args) {
		
		// Primitive and Non Primitive Data Types
		int a=10;
		float b=12.43f;
		double c= 123.2342343;
		char d = 'e';
		boolean e=true;
		boolean f=false;
		long l=12435336;
		short s=32100;
		byte b1 = 127;
		
		//Widening or up casting
		byte b2 = 100;
		int a2 = b2;
		System.out.println("Smaller container value stored in a bigger container - " + a2 );
		
		//Narrowing or down casting
		short s1 = 130;
		byte b3 = (byte) s1; //Forcibly converting and storing short container value into byte container
		System.out.println("Bigger container value stored in a smaller container - " + b3 );
		
		System.out.println("Byte value is : " + b2);
		System.out.println("Integer value of a is : " + a); // Integer 
		System.out.println("Float value of b is : " + b); // Float
		System.out.println("Double value of c is : " + c); // Double
		System.out.println("Char value of d is : " + d); // Char
		System.out.println("Boolean value of e is : " + e); // Boolean
		System.out.println("Long value of l is : " + l); // Long
		System.out.println("Short value of s is : " + s); // Short
		System.out.println(a + " " + b + " " +c); // Print all
		
		String sText = "hello world";  //String
		System.out.println("String value is : " + sText);
		
		//Array
		int[] Marks = {10,20,40,80,60};
		String[] strNames = {"amit","bikram","usha","swetha","sirisha","mounika","priyanka"};
		System.out.println("First element of Marks array is : " + Marks[0]);
		System.out.println("Second element of Names array is : " + strNames[1]);
		System.out.println(Marks[0]+ " " + Marks[1]+ " " + Marks[2]); // + is used for concatenation or combining
		System.out.println(strNames[0]+ " " + strNames[1]+ " " + strNames[2]);
		
	}

}
