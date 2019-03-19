package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BrowserTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void BrowserMethods() {
		driver.get("https://www.spicejet.com/"); //Access website
		driver.manage().window().maximize();  // Maximize the browser window
		Reporter.log("Successfully accessed Spicejet site");
		String strTitle  = driver.getTitle(); // Browser title
		System.out.println("Browser title is : " + strTitle);
		System.out.println(driver.getWindowHandle()); // Browser session ID
		System.out.println(driver.getCurrentUrl()); //Current page URL
		//System.out.println(driver.getPageSource());
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
