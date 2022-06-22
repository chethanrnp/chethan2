package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p12 {

	 @DataProvider(parallel=true)
	 public Object[][] actiLoginData()
	 {
		 Object[][] ob=new Object[3][2];
		 ob[0][0]="admin";
		 ob[0][1]="manager";
		 ob[1][0]="sudeep";
		 ob[1][1]="chaitra";
		 ob[2][0]="sunny";
		 ob[2][1]="sharath";
		 return ob;
	 }
	 @Test(dataProvider="actiLoginData")
	 public void actiLoginScript(String un,String pw) 
	 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
		    driver.findElement(By.className("textField")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
			driver.close();
	 }
}
