package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
     public static void main(String[] args) {
    	 //sets the path for chromedriver
    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	 //launches the chrome browser
    	 WebDriver driver=new ChromeDriver();
    	 //maximises the window
    	 driver.manage().window().maximize();
    	 //fetches the web app and waits until the page is loaded
    	       driver.get("https://www.facebook.com");
    	       //navigates to the specified url
    	       driver.navigate().to("https://www.flipkart.com");
    	       //navigates back
    	       driver.navigate().back();
    	      // navigates in the forward direction
    	       driver.navigate().forward();
    	       //refreshes the webpage
    	       driver.navigate().refresh();
	}
}
