package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p6 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("https://demo.actitime.com/login.do");
		      driver.findElement(By.name("username")).sendKeys("admin");
		       //identifies password and enters data
		       driver.findElement(By.name("pwd")).sendKeys("manager");
		       //clicks on login button
		       driver.findElement(By.id("loginButton")).click();
		      FluentWait wait=new FluentWait(driver);
		      //specifies polling period
		      wait.pollingEvery(Duration.ofMillis(250));
		      //specifies timeout period 
		      wait.withTimeout(Duration.ofSeconds(10));
		      //ignores exception
		      wait.ignoring(NoSuchElementException.class);
		      //waits for visibility of users element
		      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='content users']")));
		       driver.findElement(By.xpath("//a[@class='content users']")).click();
	
	}
}
