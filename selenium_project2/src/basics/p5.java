package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		       driver.get("file:///C:/Users/HP/Desktop/selenium_1.html");
		       //identifies the webelement using id attributes
		      //  WebElement link = driver.findElement(By.id("i1"));
		       //identifies the webelement using name attributes
		              //  WebElement link = driver.findElement(By.name("n1"));
		       //identifies the webelement using  class attributes
		             //WebElement link = driver.findElement(By.className("c1"));
		       //identifies the webelement using tagename
		       //     WebElement link = driver.findElement(By.tagName("a"));
		      // WebElement link = driver.findElement(By.linkText("Facebook"));
		       WebElement link = driver.findElement(By.partialLinkText("Face"));
		        //clicks on the webelements
		        link.click();
	}
}
