package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p16 {

	 @Test
	 public void actiLoginScript() throws Throwable 
	 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
		    driver.get("https://demo.actitime.com/login.do");
		    WebElement checkbox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		   // checkbox.click();
		    Assert.assertTrue(checkbox.isSelected());
		    driver.close();
	 }
}
