package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Javascript_Methods {
	public WebDriver driver;
	String strRootpath = System.getProperty("user.dir");

	@Test
	public void Javascriptexecutor_Methods_Demo() throws InterruptedException {
		
		//Display alert popup
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hello world');");
		
		//Refresh Browser
		js.executeScript("history.go(0)");
		
		//Page title
		System.out.println(driver.getTitle());
		System.out.println("Javscript extracted : " + js.executeScript("return document.title;").toString());
		
		//Highlight element/object
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.findElement(By.xpath("//span[contains(text(),'Flights')]")));
		Thread.sleep(2000);
		
		//Click on checkbox
		js.executeScript("arguments[0].click();", driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")));
		Thread.sleep(2000);
		
		//Vertical scroll - down by 150  pixels
		 js.executeScript("window.scrollBy(0,250)");
		 Thread.sleep(2000);
		
		//Page source html
		String sText =  js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
		
	
	}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", strRootpath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver(); // Chrome browser will be launched with a new profile
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
