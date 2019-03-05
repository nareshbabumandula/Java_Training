package acccess.modifiers;

public class PublicTest {

	public String USERNAME = "naresh";
	public String PASSWORD = "selenium";


	public void AccessSite()
	{
		System.out.println("Executing AccessSite method...");
	}

	public void Login()
	{
		System.out.println("Executing Login method...");
	}

	public void Logout()
	{
		System.out.println("Executing Logout method...");
	}
	
	public PublicTest() {
		System.out.println("Executing Public Constructor...");
	}

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();

	}

}
