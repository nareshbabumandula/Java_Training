package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class SwitchToWindowTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void SwitchToTabMethods() {

		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String sessionID1 = driver.getWindowHandle(); //Storing the first session ID
			System.out.println(driver.getWindowHandle()); // Session ID of the browser tab
			driver.findElement(By.linkText("GIFT CARD")).click(); //Click on GIFT CARD link
			System.out.println(driver.getWindowHandles()); // Session ID's of the browser tabs

			Set<String> tabs = driver.getWindowHandles();

			for (Iterator iterator = tabs.iterator(); iterator.hasNext();) {
				String sessionID = (String) iterator.next();
				System.out.println("Session ID is : " + sessionID);
				if (!sessionID.contains(sessionID1)) {
					driver.switchTo().window(sessionID); // SwitCh to 2nd window/tab based on session ID
				}

			}

			System.out.println(driver.getWindowHandle()); // Print 2nd session ID
			driver.findElement(By.xpath("//input[@placeholder='Search for a gift card']")).sendKeys("New Year Card");
			Thread.sleep(5000);
			driver.switchTo().window(sessionID1); // Switch to 1st tab
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); // Select Family and Friends checkbox
			Thread.sleep(5000);
			CloseChildWindows(sessionID1); //Close all tabs except 1st tab
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
	public void CloseChildWindows(String wndhandle) {

		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(wndhandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		//driver.quit();
	}


}
