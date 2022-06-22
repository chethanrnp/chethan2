package popUp_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivision {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 // fetches the flipkart
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
}
