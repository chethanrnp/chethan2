package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeEnterTimeTrack_page {

	 @FindBy(xpath="//a[@class='content users']")
	 public WebElement lnkUsers;
	 
	 @FindBy(xpath="//a[@class='content reports']")
	 public WebElement lnkReports;
	 
	 @FindBy(id="logoutLink")
	 public WebElement btnLogout;
	 
	 public actitimeEnterTimeTrack_page(WebDriver driver) {
		 //initialises the webelements
			PageFactory.initElements(driver, this);
	}
}
