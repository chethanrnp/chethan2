package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_pages {
  
	@FindBy(name="username")
	private WebElement tbUsername;
	
	@FindBy(name="pwd")
	private WebElement tbPassword;
	
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	
	public practice_pages(WebDriver driver) {
         PageFactory.initElements(driver, this);
	}
	
	public void login(String un,String pw)
	{
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}
 }
