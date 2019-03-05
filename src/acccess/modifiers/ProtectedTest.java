package acccess.modifiers;

public class ProtectedTest {

	protected String USERNAME = "naresh";
	protected String PASSWORD = "selenium";


	protected void AccessSite()
	{
		System.out.println("Executing AccessSite method...");
	}

	protected void Login()
	{
		System.out.println("Executing Login method...");
	}

	protected void Logout()
	{
		System.out.println("Executing Logout method...");
	}
	
	protected ProtectedTest() {
		System.out.println("Executing protected Constructor...");
	}

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();

	}

}
