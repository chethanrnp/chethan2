package javascript_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabledTextBox {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		       driver.get("file:///C:/Users/HP/Desktop/selenium_7.html");
		       //object casted from webdriver to javascriptexecutor type
		       JavascriptExecutor j=(JavascriptExecutor) driver;
		       j.executeScript("document.getElementById('i1').value='abhi'");
		      Thread.sleep(7000);
		      //j.executeScript("document.getElementById('i1').value=''");
		       driver.quit();
	}
}
