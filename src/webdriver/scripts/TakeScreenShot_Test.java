package webdriver.scripts;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakeScreenShot_Test {
	public WebDriver driver;
	String strPath = System.getProperty("user.dir");
	
	@Test(priority=0)
	public void CaptureScreenShot() throws Exception {
		try{
			driver.findElement(By.name("userName123")).sendKeys("naresh223");
		}
		catch (Exception e){
			getscreenshot();
		}
	}

	
	public void getscreenshot() throws Exception 
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File(strPath + "\\screenshots\\Screenshot_1.bmp"));
	}
	
	
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", strPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close(); //Close the browser
	}
}




