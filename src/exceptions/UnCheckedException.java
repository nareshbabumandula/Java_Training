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
			//System.out.println(marks[5]);
			int x = 1000/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found");
		}
	}
		
		
	
	
	public static void main(String[] args) {
		UnCheckedException uc = new UnCheckedException();
		uc.Arithmatic();
		//uc.Array_Test();

	}

}
