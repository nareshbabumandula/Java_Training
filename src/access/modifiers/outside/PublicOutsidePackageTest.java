package access.modifiers.outside;

import acccess.modifiers.PublicTest;

public class PublicOutsidePackageTest {

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();

	}

}
