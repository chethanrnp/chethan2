package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		      List<WebElement> links = driver.findElements(By.xpath("//a"));
		      System.out.println(links.size());
		      System.out.println(links.getClass().getName());
		      for(WebElement lv:links) {
		 System.out.println(lv.getText());
		      }
		      driver.quit();
	}
}
