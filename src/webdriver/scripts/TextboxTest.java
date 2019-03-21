package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TextboxTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void TextboxMethods() {
		
		try {
			driver.get("http://newtours.demoaut.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			WebElement USERNAME = driver.findElement(By.name("userName"));
			System.out.println("Display status is : " + USERNAME.isDisplayed());
			System.out.println("Enable status is : " + USERNAME.isEnabled());
			System.out.println("Type attribute value is : " + USERNAME.getAttribute("type"));
			System.out.println("Size attribute value is : " + USERNAME.getAttribute("size"));
			System.out.println("Tagname is : " +  USERNAME.getTagName());
			
			//Enter the data in a textbox
			USERNAME.sendKeys("naresh");
			System.out.println("Value found in the textbox is : " + USERNAME.getAttribute("value"));
			Thread.sleep(3000);
			USERNAME.clear(); // Clear the date from the textbox
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
