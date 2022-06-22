package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	 public static void main(String[] args) {
		//sets the path for chromedriver
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 //launches the chrome browser
		 WebDriver driver=new ChromeDriver();
		 //fetches the web app and waits until the page is loaded
		       driver.get("https://www.facebook.com");
		       //maximises the window
		     //  driver.manage().window().maximize();
		       //maximises the window
		       driver.manage().window().fullscreen();
		       //minimize the screen
		      // driver.manage().window().minimize();
		       //get frontend page source
		             String ps = driver.getPageSource();
		             System.out.println(ps);
	}
}
