package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_pages5 {
 
	public practice_pages actilogin;
	public practice_pages2 actitimeEnterTimeTrack;
	public practice_pages3 userList;
	public practice_pages4 addUser;
	
	public practice_pages5(WebDriver driver) {
		this.actilogin=new practice_pages(driver);
		this.actitimeEnterTimeTrack =new practice_pages2(driver);
		this.userList=new practice_pages3(driver);
		this.addUser=new practice_pages4(driver);
	}
}