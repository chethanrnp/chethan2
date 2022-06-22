package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userList_page {

	 @FindBy(xpath="//div[@class='components_button_label']")
	 public WebElement lnkNewUser;
	 
	 public userList_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
