package acccess.modifiers;

public class PrivateTest {

	private String USERNAME = "naresh";
	private String PASSWORD = "selenium";


	private void AccessSite()
	{
		System.out.println("Executing AccessSite method...");
	}

	private void Login()
	{
		System.out.println("Executing Login method...");
	}

	private void Logout()
	{
		System.out.println("Executing Logout method...");
	}
	
	private PrivateTest() {
		System.out.println("Executing private Constructor...");
	}

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();

	}

}
