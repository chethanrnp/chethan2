package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p4 {

	 WebDriver driver;
	 @BeforeMethod 
	 public void precondition()
	 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
	 }
	 @AfterMethod 
	 public void postcondition() 
	 {
		driver.close(); 
	 }
	 @Test
	 public void actiLoginScript() 
	 {
		    driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.className("textField")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

	 }
	 @Test
	 public void FBloginScript() 
	 {
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhi");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
	 }
}
