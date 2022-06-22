package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_pages2 {
  
  @FindBy(xpath="//a[@class='content users']")
  private WebElement lnkUsers;
  
  public void clickUser()
  {
	this.lnkUsers.click();  
  }
  
  public practice_pages2(WebDriver driver) {
	  PageFactory.initElements(driver, this);
}
}
