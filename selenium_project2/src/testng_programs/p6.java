package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p6 extends BaseTest1{

	 @Test
	 public void FBloginScript() 
	 {
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhi");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
	 }
}
