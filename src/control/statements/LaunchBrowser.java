package control.statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	
	public WebDriver driver;

	String strRootPath = System.getProperty("user.dir");

	public void launchBrowserExample(String BROWSER)
	{
		switch (BROWSER) {
		case "ie":
			System.setProperty("webdriver.ie.driver", strRootPath + "\\browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(); // Launch browser
			driver.get("http://newtours.demoaut.com"); // Access Site
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", strRootPath + "\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", strRootPath + "\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			break;

		default:
			break;
		}
		
		driver.manage().window().maximize(); // Maximizing the browser window
		driver.quit(); // Close the WebDriver browser
	}
	
	
	
	public static void main(String[] args) {
		LaunchBrowser lb = new LaunchBrowser();
		lb.launchBrowserExample("chrome");
	}

}
