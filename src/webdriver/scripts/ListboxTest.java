package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ListboxTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void ListboxMethods() {
		
		try {
			driver.get("https://www.spicejet.com/"); //Access website
			driver.manage().window().maximize();  // Maximize the browser window
			WebElement lstCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			System.out.println("Display status is : " + lstCurrency.isDisplayed());
			System.out.println("Enable status is : " + lstCurrency.isEnabled());
			System.out.println("ID attribute value is : " + lstCurrency.getAttribute("id"));
			System.out.println("Class attribute value is : " + lstCurrency.getAttribute("class"));
			System.out.println("Name attribute value is : " + lstCurrency.getAttribute("name"));
			System.out.println("Tagname is : " +  lstCurrency.getTagName());
			
			// Select a value from the list box
			Select Currency = new Select(lstCurrency);
			Currency.selectByIndex(0);
			Thread.sleep(2000);
			Currency.selectByVisibleText("USD");
			Thread.sleep(2000);
	
			List<WebElement> CurrencyOptions = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option"));
			System.out.println("No of options found in Currency drop down are : " + CurrencyOptions.size());
			
			for (Iterator iterator = CurrencyOptions.iterator(); iterator.hasNext();) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				
			}
			
			for (int i = 0; i < CurrencyOptions.size(); i++) {
				String value = CurrencyOptions.get(i).getText();
				System.out.println("Value found is : "+ value);
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
