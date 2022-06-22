package pom_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddUser_page;
import pages.actitimeEnterTimeTrack_page;
import pages.actitime_login_page;
import pages.initialisepages;
import pages.userList_page;

public class adduserscript2 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
	    initialisepages pages = new initialisepages(driver);
	    
	    pages.actitimeLogin.login("admin", "manager");
	    pages.actitimeEnterTimeTrack.clickUsers();
	    pages.userList.clickNewUser();
	    pages.addUser.createUser("abhi", "b", "abc@gmail.com");
	}
}
