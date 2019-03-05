package acccess.modifiers;

public class DefaultOutsideClass {

	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();
	}

}
