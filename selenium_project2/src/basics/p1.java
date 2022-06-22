package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	 public static void main(String[] args) {
		 //sets the path for chromedriver
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		//launches the chrome browser
		WebDriver driver=new ChromeDriver();
		//fetches the web app and waits until the page is loaded
		driver.get("https://www.flipkart.com/");
		//close the window
		driver.close();
	}
}
