package exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TryCatchTest {

	public WebDriver driver;

	String strRootPath = System.getProperty("user.dir");
	

	/**
	 * @Description This method is used to launch the browser
	 * @Method launchBrowserTest
	 * @Output NA
	 * @author NareshBabu
	 * @param BROWSER
	 */
	public void launchBrowserTest(String BROWSER)
	{
		boolean bFlag=false;
		try {
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
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage()); // Exception description
			e.printStackTrace();
		}
		finally {
			if (bFlag==true) {
				System.out.println("Successfully launched the browser : " + BROWSER);
			} else {
				System.out.println("Failed to launch the browser  : " + BROWSER);
			}
		}
	}


	public static void main(String[] args) {
		TryCatchTest lb = new TryCatchTest();
		lb.launchBrowserTest("chrome");
	
	}


}
