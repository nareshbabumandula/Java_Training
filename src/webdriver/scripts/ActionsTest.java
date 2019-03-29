package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ActionsTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void MouseoverMethods() {
		
		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize(); //Maximize the browser window
			WebElement lnkAddons = driver.findElement(By.id("highlight-addons"));
			
			//Create an object for Actions class
			Actions menu = new Actions(driver);
			menu.moveToElement(lnkAddons).perform(); // Hover the mouse on a webelement
			Thread.sleep(2000);
			driver.findElement(By.linkText("Student Discount")).click();
			Thread.sleep(3000);
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
