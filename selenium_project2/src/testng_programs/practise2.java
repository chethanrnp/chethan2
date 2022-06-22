package testng_programs;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.initialisepages2;

public class practise2 {
 
	 @FindBy (xpath="//input[@name='username']")
	 private WebElement tbUserName;
	 
	 @FindBy (xpath="//input[@name='pwd']")
	 private WebElement tbPassword;
	 
	 @FindBy (xpath="//a[@id='loginButton']")
	 private WebElement btnLogin;
	 
	 public void login(String un,String pw) {
		this.tbUserName.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}
	
	 public practise2(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
	 @FindBy (xpath="//a[@class='content users']")
	 private WebElement lnkUsers;
	 
	 @FindBy (xpath="//a[@class='content reports']")
	 private WebElement lnkReports;
	 
	 @FindBy (xpath="//a[text()='Logout']")
	 private WebElement btnLogout;
	 
	 public void ClickUser() {
		this.lnkUsers.click();
	}
	 @FindBy (xpath="//div[@class='components_button withPlusIcon']")
	 private WebElement lnkNewUser;
	 
	 public void ClickNewuser() {
		this.lnkNewUser.click();
	}
	 @FindBy (xpath="(//input[@name='firstName'])[2]")
		private WebElement tbFirstName;
		
		@FindBy (xpath="(//input[@name='lastName'])[2]")
		private WebElement tbLastName;
		
		@FindBy (xpath="(//input[@name='email'])[2]")
		private WebElement tbEmail;
		
		@FindBy (xpath="(//div[@class='downIcon'])[5]")
		private WebElement btnDepartment;
		
		@FindBy (xpath="(//div[@class='item'])[1]")
		private WebElement btnNameDpt;
		
		@FindBy (xpath="//div[@class='components_switcher small off animated']")
		private WebElement btnApproval;
		
		@FindBy (xpath="//div[text()='Save & Send Invitation']")
		private WebElement btnSave;
		
		public void Adduser(String fn,String ln,String eml) throws Throwable {
		this.tbFirstName.sendKeys(fn);	
		this.tbLastName.sendKeys(ln);
		this.tbEmail.sendKeys(eml);
		this.btnDepartment.click();
		this.btnNameDpt.click();
		this.btnApproval.click();
		this.btnSave.click();
		}
		
}
