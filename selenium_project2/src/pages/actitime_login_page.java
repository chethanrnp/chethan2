package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import net.bytebuddy.asm.Advice.This;

public class actitime_login_page {
    //tb=text box
	 @FindBy(name="username")
	 public WebElement tbUsername;
	 
	 @FindBy(name="pwd")
	 public WebElement tbPassword;
	 
	 @FindBy(id="loginButton")
	 public WebElement btnLoginButton;
	 
	 public actitime_login_page(WebDriver driver) {
		 //initialises the webelements
		PageFactory.initElements(driver, this);
	}
}
