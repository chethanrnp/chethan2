package javascript_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.practice_pages;

public class practise {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().window().maximize();
		  driver.get("https://www.actitime.com/"); 
		  JavascriptExecutor j=(JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Start ')])[3]"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
          j.executeScript("window.scrollBy("+x+","+y+")");
	}
}
