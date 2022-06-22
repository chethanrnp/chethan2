package screenshot_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		       driver.get("https://www.facebook.com/");
		      // driver.findElement(By.name("email")).sendKeys("chethan");
		       driver.findElement(By.linkText("Create New Account")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//select[@id='day']")).click();
		  //selects date
		  driver.findElement(By.xpath("//select[@id='day']/..//option[text()='18']")).click();
		  driver.findElement(By.xpath("//select[@id='month']")).click();
		  //selects months
		  driver.findElement(By.xpath("//select[@id='month']/..//option[text()='Jan']")).click();
		  driver.findElement(By.xpath("//select[@id='year']")).click();
		  //selects year
		  driver.findElement(By.xpath("//select[@id='year']/..//option[text()='1995']")).click();
	}
}
