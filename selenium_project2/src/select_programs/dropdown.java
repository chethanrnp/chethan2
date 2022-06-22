package select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//fetches the web app and waits until the page is loaded
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement dropdown1 = driver.findElement(By.id("day"));
			Select s1=new Select(dropdown1);
			s1.selectByValue("1");
			WebElement dropdown2 = driver.findElement(By.id("month"));
			Select s2=new Select(dropdown2);
			s2.selectByValue("8");
			WebElement dropdown3 = driver.findElement(By.id("year"));
			Select s3=new Select(dropdown3);
			s3.selectByVisibleText("1993");
	}
}
