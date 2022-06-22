package testng_programs;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.practice_pages;
import pages.practice_pages2;
import pages.practice_pages3;
import pages.practice_pages4;

public class practise4 extends practise{

	 @Test(dataProviderClass=practise3.class,dataProvider="actilogindata")
	 public void actilogin(String un,String pw,String fn,String ln,String em) throws Throwable {
		 
		driver.get("https://demo.actitime.com/login.do");
	   practice_pages p1=new practice_pages(driver);
	   p1.login(un, pw);
	   practice_pages2 p2=new practice_pages2(driver);
	   p2.clickUser();
	   practice_pages3 p3=new practice_pages3(driver);
	   p3.ClickNewuser();
	   practice_pages4 p4=new practice_pages4(driver);
	   p4.Adduser(fn, ln, em);
	 }
	 
}
