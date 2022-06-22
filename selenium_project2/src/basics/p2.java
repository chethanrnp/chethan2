package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
 public static void main(String[] args) {
	//sets the path for chromedriver
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 //launches the chrome browser
	 WebDriver driver=new ChromeDriver();
	 //fetches the web app and waits until the page is loaded
	       driver.get("https://www.facebook.com");
	            //retrives the title of the webpage
	                  String actualtitle = driver.getTitle();
	                  System.out.println(actualtitle);
	                 //retrives the url of the webpage
	                     String actualurl = driver.getCurrentUrl();
	                     System.out.println(actualurl);
	                    
	                     String expectedtitle="Facebook – log in or sign up";
	                     String expectedurl="https://www.facebook.com/";
	                     //validates the login page based on title and url
	                     if(actualtitle.equals(expectedtitle)&&actualurl.equals(expectedurl))
	                     System.out.println("pass:login page is loaded");
	                     else
	                     System.out.println("fail:login page is not loaded");

}
}
