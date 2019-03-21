package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ButtonTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void ButtonMethods() {
		
		try {
			driver.get("https://www.amazon.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			WebElement btnSEARCH = driver.findElement(By.className("nav-input"));
			System.out.println("Display status is : " + btnSEARCH.isDisplayed());
			System.out.println("Enable status is : " + btnSEARCH.isEnabled());
			System.out.println("Type attribute value is : " + btnSEARCH.getAttribute("type"));
			System.out.println("Value attribute value is : " + btnSEARCH.getAttribute("value"));
			System.out.println("Tab Index attribute value is : " + btnSEARCH.getAttribute("tabindex"));
			System.out.println("Class attribute value is : " + btnSEARCH.getAttribute("class"));
			System.out.println("Tagname is : " +  btnSEARCH.getTagName());
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("umbrella");
			Thread.sleep(2000);
			//Click the search button
			btnSEARCH.click();
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
