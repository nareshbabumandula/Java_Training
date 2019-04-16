package testng.examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {

	@Test
	@Parameters({ "first-name" })
	public void testSingleString(String firstName) 
	{
	  System.out.println("Invoked testString " + firstName);
	  assert "Cedric".equals(firstName);
	}

}
