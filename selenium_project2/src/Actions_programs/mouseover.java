package Actions_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseover {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//fetches the web app and waits until the page is loaded
			driver.get("https://www.vtiger.com/");
			driver.manage().window().maximize();
	//	WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
			Actions a=new Actions(driver);
		//	a.moveToElement(element).perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Resources')]")));
			a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Resources')]"))).perform();
			//int x = element.getLocation().getX();
			//int y = element.getLocation().getY();
			//Robot r=new Robot();
			//r.mouseMove(x, y);
	}
}
