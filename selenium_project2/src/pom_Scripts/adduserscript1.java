package pom_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddUser_page;
import pages.actitimeEnterTimeTrack_page;
import pages.actitime_login_page;
import pages.userList_page;

public class adduserscript1 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			actitime_login_page ob1 = new actitime_login_page(driver);
			ob1.tbUsername.sendKeys("admin");
			ob1.tbPassword.sendKeys("manager");
			ob1.btnLoginButton.click();
			
			actitimeEnterTimeTrack_page ob2=new actitimeEnterTimeTrack_page(driver);
			ob2.lnkUsers.click();
			
			userList_page ob3=new userList_page(driver);
			ob3.lnkNewUser.click();
			
			AddUser_page ob4=new AddUser_page(driver);
			ob4.tbFirstName.sendKeys("abhi");
			ob4.tbLastName.sendKeys("b");
			ob4.tbEmail.sendKeys("abhi@gmail.com");
			ob4.btnSave.click();
	}
}
