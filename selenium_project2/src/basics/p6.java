package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {
 
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/HP/Desktop/selenium_2.html");
		 driver.manage().window().maximize();
		        //identifies the text box
		  WebElement textbox = driver.findElement(By.id("i1"));
		   //enters data into the text box
		   textbox.sendKeys("selenium");
	}
}
