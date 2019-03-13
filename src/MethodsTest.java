
public class MethodsTest {

	// This method returns void - No output
	public void Addition()
	{
		int a=10;
		int b=20;
		System.out.println("Addition of a and b is : "+ (a+b));
	}

	// This method returns int - integer
	public int Subtraction()
	{
		int a=10;
		int b=20;
		int c = b-a;
		return c;
	}
	
	// This method returns String
	public String Login()
	{
		String USERNAME = "naresh";
		String PASSWORD = "secure123";
		return "Pass";
	}
	
	// This method returns boolean true/false
	public boolean AddToCart()
	{
		String PRODUCT = "";
		if (!PRODUCT.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method with return type integer and with arguments/parameters - int a, int b
	public int Division(int a, int b)
	{
		int c = b/a;
		return c;
	}
	

	public static void main(String[] args) {
		MethodsTest mt = new MethodsTest();
		mt.Addition();
		int output = mt.Subtraction();
		System.out.println(output);
		String output1 = mt.Login();
		System.out.println(output1);
		boolean output2 = mt.AddToCart();
		System.out.println(output2);
		int output3 = mt.Division(20, 40);
		System.out.println(output3);

	}

}
