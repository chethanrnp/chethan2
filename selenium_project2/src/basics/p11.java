package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("file:///C:/Users/HP/Desktop/selenium_3.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input[tabindex=\"1\"]")).sendKeys("java");
		 driver.findElement(By.cssSelector("input[tabindex=\"2\"]")).sendKeys("selenium");

	}
}
