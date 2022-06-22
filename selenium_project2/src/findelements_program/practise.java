package findelements_program;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("woodland");
	     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    List<WebElement> title = driver.findElements(By.xpath("//div[text()='WOODLAND']"));
	    List<WebElement> price = driver.findElements(By.xpath("//div[text()='WOODLAND']/..//div[@class='_30jeq3']"));
	    TreeMap<Integer, String> t=new TreeMap<>();
	    for (int i = 0; i < title.size(); i++) {
			String titles=title.get(i).getText();
			int p=Integer.parseInt(price.get(i).getText().substring(1).replace(",", ""));
			System.out.println(titles+"="+p);
			//t.put(p, titles);
		}
	    
	//    for(Entry<Integer, String> lv:t.entrySet()) {
	 //   	System.out.println(lv.getValue()+"="+lv.getKey());
	   // }
	    
	 }
}
