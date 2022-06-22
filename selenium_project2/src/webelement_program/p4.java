package webelement_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		       driver.get("https://demo.actitime.com/login.do");
		       WebElement text = driver.findElement(By.id("headerContainer"));
		       // checks whether text is displayed
		       System.out.println(text.isDisplayed());
		       if(text.isDisplayed())
		       System.out.println("login page is loded");
		       else
		       System.out.println("login page is not loaded");
		      
		        String css1 = text.getCssValue("font-family");
		        String css2 = text.getCssValue("font-size");
		        System.out.println(css1);
		        System.out.println(css2);
	}
}
