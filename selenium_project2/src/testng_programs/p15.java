package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p15 {

	 @Test
	 public void actiLoginScript() throws Throwable 
	 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
		    driver.get("https://demo.actitime.com/login.do");
		    WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		   // Assert.assertEquals(link.isDisplayed(), true);
		    Assert.assertTrue(link.isDisplayed());
	 }
}
