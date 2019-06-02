package webdriver.scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sikuli_Demo {
	
	public WebDriver driver;
	String strRootPath = System.getProperty("user.dir");
	
	@Test
	public void Sikuli_Methods() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		//Pattern chkFamilyAndFriends = new Pattern(strRootPath + "/images/FamilyAndFriends.png");
		Pattern btnRoundTrip = new Pattern(strRootPath + "/images/RoundTrip.png");
		Thread.sleep(4000);
		screen.click(btnRoundTrip);
		Thread.sleep(4000);
	}
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", strRootPath + "/browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
