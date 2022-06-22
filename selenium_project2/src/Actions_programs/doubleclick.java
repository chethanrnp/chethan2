package Actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("file:///C:/Users/HP/Desktop/doubleclick.html");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
			Actions a=new Actions(driver);
			a.doubleClick(element).perform();
			//a.doubleClick(driver.findElement(By.xpath("//p[@id='demo']"))).perform();
			
	}
}
