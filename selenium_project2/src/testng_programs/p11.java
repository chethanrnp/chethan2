package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p11 {

	 @DataProvider
	 public Object[][] fbLoginData()
	 {
		 Object[][] ob=new Object[3][2];
		 ob[0][0]="pooja";
		 ob[0][1]="1234";
		 ob[1][0]="sudeep";
		 ob[1][1]="chaitra";
		 ob[2][0]="sunny";
		 ob[2][1]="sharath";
		 return ob;
	 }
	 @Test(dataProvider="fbLoginData")
	 public void FBloginScript(String un,String pw) 
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://www.facebook.com/");
			//extent report to see report
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pw);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.close();
	 }
}
