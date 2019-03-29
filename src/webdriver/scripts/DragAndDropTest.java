package webdriver.scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class DragAndDropTest {

	WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	@Test
	public void DragAndDropMethods() {
		
		try {
			driver.get("http://jqueryui.com/"); //Access website
			driver.manage().window().maximize(); //Maximize the browser window
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Draggable")).click();
			driver.switchTo().frame(0);
			
			Actions dragme = new Actions(driver);
			WebElement source = driver.findElement(By.id("draggable"));
			dragme.dragAndDropBy(source, 265, 15).perform(); //Drag the webelement to a particular position
			Thread.sleep(5000);		
			
			driver.switchTo().defaultContent(); //Switch out from the frame
			driver.findElement(By.linkText("Droppable")).click();
			driver.switchTo().frame(0);
			WebElement dragsource = driver.findElement(By.id("draggable"));
			WebElement dragdestination = driver.findElement(By.id("droppable"));
			dragme.dragAndDrop(dragsource, dragdestination).perform();
			Thread.sleep(5000);		
			
					
					
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
