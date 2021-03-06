package pom;


import org.testng.annotations.Test;
import object.repository.Homepage;
import object.repository.Searchpage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class TC01 extends Homepage{

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");
	
	Searchpage sp = new Searchpage();

	@Test
	public void ButtonMethods() {
		
		try {
			driver.get("https://www.amazon.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			driver.findElement(txtSearch).sendKeys("umbrella"); // WIth POM
			driver.findElement(btnSEARCH).click(); // Page object model syntax
			Thread.sleep(4000);
			Searchpage page = PageFactory.initElements(driver,Searchpage.class);
			page.verifyResultsCount();
			//System.out.println(driver.findElement(By.xpath("//div[@class='sg-col-inner']/div/span")).getText());
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
