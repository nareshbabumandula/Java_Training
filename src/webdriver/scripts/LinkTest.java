package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class LinkTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void LinkMethods() {
		
		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			//WebElement CORPORATE = driver.findElement(By.linkText("Corporate Overview"));
			WebElement CORPORATE = driver.findElement(By.partialLinkText(("Overview")));
			System.out.println("Display status is : " + CORPORATE.isDisplayed());
			System.out.println("Enable status is : " + CORPORATE.isEnabled());
			System.out.println("href attribute value is : " + CORPORATE.getAttribute("href"));
			System.out.println("Tagname is : " +  CORPORATE.getTagName());
			System.out.println("Link text is : " +  CORPORATE.getText());
			
			String strText = CORPORATE.getText();
			
			if (strText.contains("Corporate")) {
				Reporter.log("Corporate link text is displayed");
			} else {
				Reporter.log("Corporate link text is not displayed");
			}
					
			//Enter the data in a textbox
			CORPORATE.click();
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
