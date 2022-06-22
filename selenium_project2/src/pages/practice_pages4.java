package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_pages4 {
 
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
	Thread.sleep(2000);
	this.btnNameDpt.click();
	Thread.sleep(2000);
	this.btnApproval.click();
	this.btnSave.click();
	}
	
	public practice_pages4(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
}
