package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CheckboxTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void CheckboxMethods() {
		
		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			WebElement chkFamilyandFriends = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
			System.out.println("Display status is : " + chkFamilyandFriends.isDisplayed());
			System.out.println("Enable status is : " + chkFamilyandFriends.isEnabled());
			System.out.println("Checkbox selection status by default is : " + chkFamilyandFriends.isSelected());
			System.out.println("ID attribute value is : " + chkFamilyandFriends.getAttribute("id"));
			System.out.println("Type attribute value is : " + chkFamilyandFriends.getAttribute("type"));
			System.out.println("Name attribute value is : " + chkFamilyandFriends.getAttribute("name"));
			System.out.println("Tagname is : " +  chkFamilyandFriends.getTagName());
			
			// Select the check box
			chkFamilyandFriends.click();
			System.out.println("Checkbox selection status after selecting is : " + chkFamilyandFriends.isSelected());
			
			List<WebElement> noofCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("No of checkboxes displayed are : " + noofCheckboxes.size());
			
			for (Iterator iterator = noofCheckboxes.iterator(); iterator.hasNext();) {
				WebElement webElement = (WebElement) iterator.next();
				Thread.sleep(1000);
				try {
					webElement.click(); // Click/Select every check box
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(webElement + " is not clickable");
				}
			}
			
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
