package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {

	 public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			//clicks on actitime linc
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			closetabs(driver);
			System.out.println(driver.getTitle());
	}
	 public static void closetabs(WebDriver driver) {
		String maintab = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		for(String lv:alltabs) {
			driver.switchTo().window(lv);
			if(lv.equals(maintab))
				driver.close();
		}
	}
}
