package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin2 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		//	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abhi");
		//	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234");
		//	driver.findElement(By.cssSelector("button[name='login']")).click();
			//use only for id [tagname#id]
			driver.findElement(By.cssSelector("input#email")).sendKeys("abhi");
			driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
			//only when type=submit use subit
			driver.findElement(By.cssSelector("button[name='login']")).submit();
			//note:use only for classname [tagname.classname]
	}
}
