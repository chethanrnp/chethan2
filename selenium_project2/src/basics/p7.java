package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://demoqa.com/browser-windows");
		    driver.manage().window().maximize();
		    //clicks on new window
		    driver.findElement(By.id("windowButton")).click();
		    //clicks on new window
		    driver.findElement(By.id("windowButton")).click();
		    
		    //closes all the windows or tabs
		    driver.quit();
	}
}
