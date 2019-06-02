package object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage {

	WebDriver driver;
	
	/*@FindBy(how=How.XPATH, using="//div[@class='sg-col-inner']/div/span")
	WebElement lblSearchResultsCount; 
	*/
	
	public static By imgSearch = By.id("asdf");
	
	@FindBy(xpath="//div[@class='sg-col-inner']/div/span")
	WebElement lblSearchResultsCount;
		
	public void verifyResultsCount()
	{
       System.out.println(lblSearchResultsCount.getText());
    }
	

}
