package popUp_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptpopUp2 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/HP/Desktop/alert.html");
		   driver.findElement(By.xpath("//button[text()='Try it']")).click();
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.alertIsPresent());
		   Thread.sleep(3000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
	}
}
