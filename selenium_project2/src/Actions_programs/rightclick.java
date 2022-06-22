package Actions_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	 public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			//WebElement element = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
			//right click on webelement
			Actions a=new Actions(driver);
			//a.contextClick(element).perform();
			a.contextClick(driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"))).perform();
			Robot r=new Robot();
			//presses key G
			r.keyPress(KeyEvent.VK_G);
			r.keyRelease(KeyEvent.VK_G);
	}
}
