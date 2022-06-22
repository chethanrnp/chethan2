package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.AddUser_page;
import pages.actitimeEnterTimeTrack_page;
import pages.actitime_login_page;
import pages.userList_page;

public class p13 {

	 @Test(dataProviderClass=dataclass.class,dataProvider="adduserData")
	 public void adduserScript(String un,String pw,String fn,String ln,String em)
	 {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
			
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			actitime_login_page ob1 = new actitime_login_page(driver);
			ob1.tbUsername.sendKeys(un);
			ob1.tbPassword.sendKeys(pw);
			ob1.btnLoginButton.click();
			driver.close();
			
			actitimeEnterTimeTrack_page ob2=new actitimeEnterTimeTrack_page(driver);
			ob2.lnkUsers.click();
			
			userList_page ob3=new userList_page(driver);
			ob3.lnkNewUser.click();
			
			AddUser_page ob4=new AddUser_page(driver);
			ob4.tbFirstName.sendKeys(fn);
			ob4.tbLastName.sendKeys(ln);
			ob4.tbEmail.sendKeys(em);
			ob4.btnSave.click(); 
	 }
}
