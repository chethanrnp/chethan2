package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest3 {
 
	 @BeforeSuite
	 public void beforeSuite()
	 {
		 System.out.println("hey Suite execution");
	 }
	 
	 @AfterSuite
	 public void AfterSuite()
	 {
		 System.out.println("hey Suite completed execution");
	 }
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("Test began its execution");
	 }
	 @AfterTest
	 public void afterTest()
	 {
		 System.out.println("Test completed its execution");
	 }
	
}
