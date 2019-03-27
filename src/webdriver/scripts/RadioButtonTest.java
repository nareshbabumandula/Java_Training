package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class RadioButtonTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void RadioButtonMethods() {
		
		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			WebElement rbtnRoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
			System.out.println("Display status is : " + rbtnRoundTrip.isDisplayed());
			System.out.println("Enable status is : " + rbtnRoundTrip.isEnabled());
			System.out.println("Radiobutton selection status by default is : " + rbtnRoundTrip.isSelected());
			System.out.println("ID attribute value is : " + rbtnRoundTrip.getAttribute("id"));
			System.out.println("Value attribute value is : " + rbtnRoundTrip.getAttribute("value"));
			System.out.println("Type attribute value is : " + rbtnRoundTrip.getAttribute("type"));
			System.out.println("Name attribute value is : " + rbtnRoundTrip.getAttribute("name"));
			System.out.println("Tagname is : " +  rbtnRoundTrip.getTagName());
			
			// Select the radio button
			rbtnRoundTrip.click();
			System.out.println("Radio button selection status after selecting is : " + rbtnRoundTrip.isSelected());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

	@BeforeClass
	public void LauchBrowser() {
		System.setProperty("webdriver.chrome.driver", strRootPath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver(); // Chrome browser will be launched with a new profile
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit(); // Kill/Quit the browser
	}
		
}
