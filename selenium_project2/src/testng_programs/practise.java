package testng_programs;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.initialisepages2;

public class practise {
 WebDriver driver;
 @Parameters("Browser")
 @BeforeMethod
 public void precondition(String bn) {
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");  
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    if(bn.equals("chrome"))
		driver=new ChromeDriver();
	    else if(bn.equals("firefox")) {
		driver=new FirefoxDriver();
	    }
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }
 
 @AfterMethod
 public void postcondition() {
	 driver.quit();
 }
}
