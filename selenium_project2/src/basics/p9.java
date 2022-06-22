package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {

	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		     driver.get("https://demoqa.com/browser-windows");
		     driver.manage().window().maximize();
		     //clicks on new window
		     driver.findElement(By.id("windowButton")).click();
		     //clicks on new window
		     driver.findElement(By.id("windowButton")).click();
		    closewindows(driver);
		  }
		  public static void closewindows(WebDriver driver) {
		  //returns the refrence of main window
		  String mainwindow = driver.getWindowHandle();
		     //returns the refrence of all the windows
		     Set<String> allwindows = driver.getWindowHandles();
		     for(String lv:allwindows) {
		      driver.switchTo().window(lv);
		      if(!lv.equals(mainwindow))
		      driver.close();
		     }
		     driver.switchTo().window(mainwindow);    
		  }
	
}
