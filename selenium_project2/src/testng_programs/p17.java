package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class p17 {

	 @Test
	 public void actiLoginScript() throws Throwable 
	 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			SoftAssert s=new SoftAssert();
			//validating the launch of chrome browser
			Set<String> handles = driver.getWindowHandles();
			s.assertEquals( handles.size(),5);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
		    driver.get("https://demo.actitime.com/login.do");
			//validating the loding of the login page
			s.assertEquals(driver.getTitle(), "actiTIME - Login");
			driver.manage().window().maximize();
		    driver.findElement(By.className("textField")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			String actualtitle = driver.getTitle();
			//org testng
		s.assertEquals(actualtitle, "actiTIMEEn");
			//s.assertEquals(actualtitle, "actiTIME - Enter Time-Track");

			driver.close();
			s.assertAll();
	 }
}
