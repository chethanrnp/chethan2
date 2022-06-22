package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.practice_pages3;

public class practise {

	 public static void main(String[] args) throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
          driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/browser-windows");
	     driver.findElement(By.xpath("//button[text()='New Window']")).click();
	     driver.findElement(By.xpath("//button[text()='New Window']")).click();
	     closeWindow(driver);
	     }
	public static void closeWindow(WebDriver driver) {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String lv:allWindow) {
			driver.switchTo().window(lv);
			if(!lv.equals(mainWindow))
				driver.close();
		}
	}
}
