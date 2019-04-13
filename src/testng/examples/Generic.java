package testng.examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Generic {
	
	@BeforeSuite
	public void LaunchBrowser()
	{
		System.out.println("Executing LaunchBrowser method..");
	}

	@AfterSuite
	public void CloseBrowser()
	{
		System.out.println("Executing CloseBrowser method..");
	}
}
