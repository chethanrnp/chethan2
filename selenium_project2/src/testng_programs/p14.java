package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p14 {

	 @Test
	 public void actiLoginScript() throws Throwable 
	 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//validating the launch of chrome browser
			Set<String> handles = driver.getWindowHandles();
			Assert.assertEquals(1, handles.size());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
		    driver.get("https://demo.actitime.com/login.do");
			//validating the loding of the login page
			Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
			driver.manage().window().maximize();
		    driver.findElement(By.className("textField")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			String actualtitle = driver.getTitle();
			//org testng
		//	Assert.assertEquals(actualtitle, "actiTIMEEn");
			Assert.assertEquals(actualtitle, "actiTIME - Enter Time-Track");

			driver.close();
			
	 }
}
