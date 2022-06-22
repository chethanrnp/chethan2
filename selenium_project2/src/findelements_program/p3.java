package findelements_program;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 // fetches the flipkart
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 //clicks on close button
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 //identifies the searchbox and enters the data
		 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("woodland shoes");
		 //identifies search button and click on it
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(7000);
		 List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		 List<WebElement> price = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
		 TreeMap< Integer,String> tm=new TreeMap<>();
		 for (int i = 0; i < titles.size(); i++) {
		 String p1=price.get(i).getText();
		 int p2=Integer.parseInt(p1.substring(1).replace(",", ""));
		 String t=titles.get(i).getText();
		 tm.put(p2, t);
		 }
		 System.out.println(tm);
		 for(Entry<Integer, String> lv:tm.entrySet()) {
		 System.out.println(lv.getValue()+"="+lv.getKey());
		 }
		 driver.quit();

	}
}
