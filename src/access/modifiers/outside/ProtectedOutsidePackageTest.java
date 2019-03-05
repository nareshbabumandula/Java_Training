package access.modifiers.outside;

import acccess.modifiers.ProtectedTest;

public class ProtectedOutsidePackageTest extends ProtectedTest {

	public static void main(String[] args) {
		//ProtectedTest pt = new ProtectedTest();
		
		ProtectedOutsidePackageTest pt = new ProtectedOutsidePackageTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.Logout();

	}

}
