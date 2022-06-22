package webelement_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		     driver.get("https://demo.actitime.com/login.do");
		           //identifies username and password
		     WebElement username = driver.findElement(By.name("username"));
		     //enters the data in username
		     username.sendKeys("12345");
		     Thread.sleep(7000);
		     //clear the textbox
		     username.clear();
	}
}
