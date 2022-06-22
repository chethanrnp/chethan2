package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_pages3 {
 
	 @FindBy (xpath="//div[@class='components_button withPlusIcon']")
	 private WebElement lnkNewUser;
	 
	 public void ClickNewuser() {
		this.lnkNewUser.click();
	}
	 
	 public practice_pages3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
}
