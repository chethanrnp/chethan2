package pom_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.actitime_login_page;

public class loginscript1 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			actitime_login_page ob = new actitime_login_page(driver);
			ob.tbUsername.sendKeys("admin");
			ob.tbPassword.sendKeys("manager");
			ob.btnLoginButton.click();
	}
}
