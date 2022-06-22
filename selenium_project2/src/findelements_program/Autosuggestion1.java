package findelements_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 // fetches the flipkart
		 driver.get("https://www.google.co.in");
		 driver.manage().window().maximize();
		 //identify the search box and enters the dat
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		 Thread.sleep(7000);
		 List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

		 for (WebElement lv:sugg) {
		 System.out.println(lv.getText());

		 }

		 driver.quit();
	}
}
