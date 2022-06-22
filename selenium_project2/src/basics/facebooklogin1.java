package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin1 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//identifies username
			WebElement username = driver.findElement(By.id("email"));
			//enters the data into username
			username.sendKeys("abhi");
			//identifies password
			WebElement password = driver.findElement(By.id("pass"));
			//enters the data into the password
			password.sendKeys("1234");
			//identifies login button
			WebElement loginbutton = driver.findElement(By.name("login"));
			//clicks on login button
			loginbutton.click();
			
	}
}
