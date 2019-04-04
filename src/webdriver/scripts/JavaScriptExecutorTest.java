package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class JavaScriptExecutorTest {

	WebDriver driver;

	@Test
	public void JavaScriptExecutorMethods() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/"); //Access Site
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//driver.findElement(By.linkText("REGISTER")).click();
		executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("REGISTER")));
		System.out.println("This is javascript executor method");
		executor.executeScript("alert('This is javascript executor alert');"); 
		Thread.sleep(5000);

	}

	@BeforeClass
	public void LaunchBrowser() {
		String strPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit(); //Close the browser
	}

	

}
