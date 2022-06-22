package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://demoqa.com/browser-windows");
		    driver.manage().window().maximize();
		    //clicks on new window
		    driver.findElement(By.id("windowButton")).click();
		    //clicks on new window
		    driver.findElement(By.id("windowButton")).click();
		    //returns the refrence of main windows
		    String mainwindow = driver.getWindowHandle();
		    System.out.println(mainwindow);
		    //returns the refrence of all the windows
		    Set<String> allwindows = driver.getWindowHandles();
		    System.out.println(allwindows);
		    //gives the class name of the set
		    System.out.println(allwindows.getClass().getName());
		    for(String lv:allwindows) {
		     //switches the control to specified window
		     driver.switchTo().window(lv);
		     //closes the window where the control is
		    driver.close();
		     Thread.sleep(7000);
		    }

	}
}
