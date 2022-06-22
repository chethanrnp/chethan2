package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p3 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.actitime.com/login.do");
		     String logintitle = driver.getTitle();
		     System.out.println(logintitle);
		       driver.findElement(By.name("username")).sendKeys("admin");
		       //identifies password and enters date
		       driver.findElement(By.name("pwd")).sendKeys("manager");
		       //clicks on login button
		       driver.findElement(By.id("loginButton")).click();
		       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		       wait.until(ExpectedConditions.titleContains("Enter"));
		       String landingtitle = driver.getTitle();
		       System.out.println(landingtitle);
	
	}
}
