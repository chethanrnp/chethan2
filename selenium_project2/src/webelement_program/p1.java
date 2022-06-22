package webelement_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		       driver.get("https://demo.actitime.com/login.do");
		           //identifies username and password
		        WebElement username = driver.findElement(By.name("username"));
		        WebElement password = driver.findElement(By.name("pwd"));
		        //gets the height and width of username
		        int h1 = username.getSize().height;
		        int w1 = username.getSize().width;
		      //gets the height and width of password
		        int h2 = password.getSize().height;
		        int w2 =password.getSize().width;
		        //validates the dimension of username and password
		        if(h1==h2&w1==w2)
		         System.out.println("username and password are of same dimension");
		        else
		         System.out.println("username and password are of different dimension");
		        
		        
		        driver.quit();
	}
}
