package testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class DependsOnMethods{

	@BeforeClass
	public void Login() {
		System.out.println("Executing Login method...");
	}

	@Test
	public void SearchProduct() {
		System.out.println("Executing SearchProduct method...");
	}

	@Test(dependsOnMethods= {"SearchProduct"})
	public void AddToCart()
	{
		System.out.println("Executing AddToCart method...");
	}
	
	@Test(dependsOnMethods= {"AddToCart"})
	public void ProductStockAvailability()
	{
		System.out.println("Executing ProductStockAvailability method...");
	}
	
	@AfterClass
	public void Logout()
	{
		System.out.println("Executing Logout method...");
	}


	
	
}
