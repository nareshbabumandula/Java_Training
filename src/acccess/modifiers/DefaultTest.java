package acccess.modifiers;

public class DefaultTest {

	String USERNAME = "naresh";
	String PASSWORD = "selenium";


	void AccessSite()
	{
		System.out.println("Executing AccessSite method...");
	}

	void Login()
	{
		System.out.println("Executing Login method...");
	}

	void Logout()
	{
		System.out.println("Executing Logout method...");
	}
	
	DefaultTest() {
		System.out.println("Executing default Constructor...");
	}

	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();

	}

}
