package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p9 extends BaseTest3{
	 WebDriver driver;
	 @Parameters("Browser")
	 @Test
	 public void FBloginScript(String bn) 
	 {
		    System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");  
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    if(bn.equals("chrome"))
			driver=new ChromeDriver();
		    else if(bn.equals("firefox"))
			driver=new FirefoxDriver();
		    
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
