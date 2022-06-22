package testng_programs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.practice_pages;
import pages.practice_pages2;
import pages.practice_pages3;
import pages.practice_pages4;

public class practise5 {
   WebDriver driver;
  
	 @Test
	 public void login() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  Set<String> handle = driver.getWindowHandles();
		  assertEquals(handle.size(), 1);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.manage().deleteAllCookies();
		  driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//input[@name='remember']"));
		link.click();
		assertTrue(link.isSelected());
		  driver.findElement(By.name("username")).sendKeys("admin");
		  //identifies password and enters data
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   //clicks on login button
		   driver.findElement(By.id("loginButton")).click();
		   
      }
	 @Test(dependsOnMethods= {"login"})
	 public void clickOnUser() {
		
		       driver.findElement(By.xpath("//a[@class='content users']")).click();
      }
	
	@Test(dependsOnMethods= {"login","clickOnUser"})
	 public void AddUser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("arya");
		driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys("u");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("arya@gmail.com");
		driver.findElement(By.xpath("(//div[@class='components_button_label'])[5]")).click();
		driver.close();
	}
}
