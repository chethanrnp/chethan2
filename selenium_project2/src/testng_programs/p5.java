package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p5 extends BaseTest1{

	 @Test
	 public void actiLoginScript() 
	 {
		    driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.className("textField")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

	 }
	 
}
