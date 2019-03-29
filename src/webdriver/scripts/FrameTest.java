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

public class FrameTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void FrameMethods() {
		
		try {
			driver.get("http://jqueryui.com/"); //Access website
			driver.manage().window().maximize(); //Maximize the browser window
			driver.findElement(By.linkText("Autocomplete")).click(); //Click on AutoComplete link
			//driver.switchTo().frame(0); // Switch to iframe based on frame index
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			driver.findElement(By.id("tags")).sendKeys("selenium");
			Thread.sleep(4000);
			driver.switchTo().defaultContent(); // Come out of the frame
			driver.findElement(By.linkText("Draggable")).click();
			Thread.sleep(4000);
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
