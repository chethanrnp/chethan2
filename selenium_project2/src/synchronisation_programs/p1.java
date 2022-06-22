package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		       driver.get("https://demo.actitime.com/login.do");
		       //identifies username and enters the data
		       driver.findElement(By.name("username")).sendKeys("admin");
		       //identifies password and enters date
		       driver.findElement(By.name("pwd")).sendKeys("manager");
		       //clicks on login button
		       driver.findElement(By.id("loginButton")).click();
		       driver.findElement(By.xpath("//a[@class='content users']")).click();

	}
}
