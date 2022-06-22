package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p3 {

	 @Test
	 public void actiLoginScript() 
	 {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
		    driver.findElement(By.className("textField")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			driver.close();
	 }
	 @Test
	 public void FBloginScript() 
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://www.facebook.com/");
			//extent report to see report
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhi");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.close();
	 }
}
