package testng.examples;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="smoke")
	public void AccessSite()
	{
		System.out.println("Executing AccessSite method...");
	}
	
	@Test(groups= {"smoke","regression"})
	public void Login()
	{
		System.out.println("Executing Login method...");
	}
	
	@Test(groups={"smoke","regression"}, dependsOnMethods= {"Login"})
	public void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...");
	}
	
	@Test(groups={"smoke","regression"}, dependsOnMethods= {"SearchProduct"})
	public void AddToCart()
	{
		System.out.println("Executing AddToCart method...");
	}
	
	@Test(groups="smoke",dependsOnMethods= {"AddToCart"})
	public void Logout()
	{
		System.out.println("Executing Logout method...");
	}

}
