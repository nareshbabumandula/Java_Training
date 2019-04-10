package testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeAfterTest {


	@Test
	public void SearchProduct() {
		System.out.println("Executing SearchProduct method...");
		Reporter.log("Search Product|Successfully searched the product");
		//Assert.assertEquals("iphone", "samsung");
	}
	
	@BeforeClass
	public void Login() {
		System.out.println("Executing Login method...");
	}

	@AfterClass
	public void Logout() {
		System.out.println("Executing Logout method...");
	}

	
}
