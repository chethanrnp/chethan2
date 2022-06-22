package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p4 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		   driver.get("https://demo.actitime.com/login.do");
		     
		    
		       driver.findElement(By.name("username")).sendKeys("admin");
		       //identifies password and enters data
		       driver.findElement(By.name("pwd")).sendKeys("manager");
		       //clicks on login button
		       driver.findElement(By.id("loginButton")).click();
		       //waits for invisibility of loginbutton
		       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loginButton")));
		       //waits for visibility of users button
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));
		       driver.findElement(By.xpath("//a[@class='content users']")).click();

	}
}
