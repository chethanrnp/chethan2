package select_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		//fetches the web app and waits until the page is loaded
		driver.get("file:///C:/Users/HP/Desktop/select.html");
		driver.manage().window().maximize();
		WebElement listBox = driver.findElement(By.id("KB"));
		Select s=new Select(listBox);
		s.selectByValue("B");
		s.selectByIndex(3);
		s.selectByVisibleText("Lolipop");
		
		WebElement fs = s.getFirstSelectedOption();
           System.out.println(fs.getText());
           System.out.println("---------");
           
           List<WebElement> alls = s.getAllSelectedOptions();
           for(WebElement lv:alls) {
        	   System.out.println(lv.getText());
           }
	}

}
