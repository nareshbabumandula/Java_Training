package exceptions;

public class UnCheckedException {

	public void Arithmatic()
	{
		int x=10;
		int y = 0;
		int z = x/y;
		System.out.println("The value of z is:"+z);
	}


	public void Array_Test()
	{
		try {
			int marks[] = {10,20,70,80,90};
			System.out.println("Length of the array is:"+marks.length);
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			System.out.println(marks[2]);
			System.out.println(marks[3]);
			System.out.println(marks[4]);
			System.out.println(marks[-1]); // accessing an element beyond the size of an array
		}
		catch (ArithmeticException e) {
			System.out.println("This is arithmatic exception...");
		}

		catch (NullPointerException e) {
			System.out.println("This is NullPointer exception...");
		}

		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found");
			e.printStackTrace();
		}*/
		catch (Exception e) {
			System.out.println("This is Exception...");
			e.printStackTrace();
		}
		
	}

	
	public void Test() {
		int arrSize = -8;
		try {
		    int[] myArray = new int[arrSize];
		} catch (NegativeArraySizeException ex) {
		    System.out.println("Can't create array of negative size");
		    ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UnCheckedException uc = new UnCheckedException();
		//uc.Arithmatic();
		//uc.Array_Test();
		uc.Test();
	}

}
