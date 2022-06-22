package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser_page {

	 @FindBy(xpath="(//input[@name='firstName'])[2]")
	 public WebElement tbFirstName;
	 
	 @FindBy(xpath="(//input[@name='lastName'])[2]")
	 public WebElement tbLastName;
	 
	 @FindBy(xpath="(//input[@name='email'])[2]")
	 public WebElement tbEmail;
	 
	 @FindBy(xpath="//div[text()='Save & Send Invitation']")
	 public WebElement btnSave;
	 
	 public AddUser_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
