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

public class TestNG_Annotations extends Generic{

	@BeforeMethod
	public void verifyProductName()
	{
		System.out.println("Executing verifyProductName method...");
	}
	
	@AfterMethod
	public void verifyProductRating()
	{
		System.out.println("Executing verifyProductRating method...");
	}
	
	
	@BeforeTest
	public void AccessSite()
	{
		System.out.println("Executing AccessSite method...");
	}
	
	@AfterClass
	public void verifyProductPrice()
	{
		System.out.println("Executing verifyProductPrice method...");
	}
	
	@Test(priority=0)
	public void SearchProduct() {
		System.out.println("Executing SearchProduct method...");
		Reporter.log("Search Product|Successfully searched the product");
		//Assert.assertEquals("iphone", "samsung");
	}

	@Test(priority=1)
	public void AddToCart()
	{
		System.out.println("Executing AddToCart method...");
	}
	
	@Test
	public void ProductStockAvailability()
	{
		System.out.println("Executing ProductStockAvailability method...");
	}
	
	
	@BeforeClass
	public void Login() {
		System.out.println("Executing Login method...");
	}

	@AfterTest
	public void Logout() {
		System.out.println("Executing Logout method...");
	}

	
	
}
