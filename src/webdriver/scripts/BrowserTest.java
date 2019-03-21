package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BrowserTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void BrowserMethods() {
		
		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			Reporter.log("Successfully accessed Spicejet site");
			String strTitle  = driver.getTitle(); // Browser title
			System.out.println("Browser title is : " + strTitle);
			System.out.println(driver.getWindowHandle()); // Browser session ID
			System.out.println(driver.getCurrentUrl()); //Current page URL
			driver.findElement(By.linkText("SPICECLUB")).click(); // Click on link SPICECLUB
			Thread.sleep(2000);
			driver.navigate().back(); // Navigate back in browser
			Thread.sleep(2000);
			driver.navigate().forward(); // Navigate forward
			Thread.sleep(2000);
			driver.navigate().refresh(); //Refresh the page
			driver.navigate().to("https://www.spicejet.com/RedHotOffers.aspx");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
