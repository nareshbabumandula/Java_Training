package testng.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	//This method will provide data to any test method that declares that its Data Provider
	//is named "test1"
	@DataProvider(name = "demo")
	public Object[][] createData1() {
	 return new Object[][] 
	{
	   { "Cedric", new Integer(36) },
	   { "Anne", new Integer(37)},
	 };
	}
	 
	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "demo")
	public void verifyData1(String n1, Integer n2) {
	 System.out.println(n1 + " " + n2);
	}

	

}
