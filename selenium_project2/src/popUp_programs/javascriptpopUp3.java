package popUp_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptpopUp3 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/HP/Desktop/prompt.html");
		   driver.findElement(By.xpath("//button[text()='Try it']")).click();
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		   //waits until alert is present
		   wait.until(ExpectedConditions.alertIsPresent());
		   Thread.sleep(3000);
		   //switches the control to js poUp
		  Alert alert = driver.switchTo().alert();
		  //enters the data into text box of the popUp
		  alert.sendKeys("abhi");
		  //clicks on ok button
		  alert.accept();
	}
}
