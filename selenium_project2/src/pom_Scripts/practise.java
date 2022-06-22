package pom_Scripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.AddUser_page;
import pages.actitimeEnterTimeTrack_page;
import pages.actitime_login_page;
import pages.practice_pages;
import pages.practice_pages2;
import pages.practice_pages5;
import pages.userList_page;

public class practise {

	@Test
	public void addUser() throws Throwable
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			practice_pages5 pages=new practice_pages5(driver);
			pages.actilogin.login("admin", "manager");
			pages.actitimeEnterTimeTrack.clickUser();
			pages.userList.ClickNewuser();
			pages.addUser.Adduser("chethan", "c", "chetham@gmail.com");
	}
}

