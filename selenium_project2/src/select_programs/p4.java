package select_programs;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p4 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("file:///C:/Users/HP/Desktop/select.html");
			driver.manage().window().maximize();
			WebElement listBox = driver.findElement(By.id("KB"));
			Select s=new Select(listBox);
			List<WebElement> allopt = s.getOptions();
			TreeSet<String> t=new TreeSet<>();
			for(WebElement lv:allopt) {
			String text=lv.getText();
				t.add(text);
			}
			System.out.println(t);
		//	Iterator<String> it = t.iterator();
			//while(it.hasNext()) {
				//String ch = it.next();
			//	System.out.println(ch);
			//}
	}
	}


