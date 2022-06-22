package webelement_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		       driver.get("https://demo.actitime.com/login.do");
		           //checks whether checkbox is selected
		      WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		      //checks whether checkbox is selected
		      System.out.println(checkbox.isSelected());
		      //clicks on check box
		      checkbox.click();
		      //checks whether checkbox is selected
		      System.out.println(checkbox.isSelected());
		      //retrives the tagname of the webelement
		      String tn = checkbox.getTagName();
		      System.out.println(tn);
		      //retrives the specified attribute of the webelement
		       String att1 = checkbox.getAttribute("type");
		       String att2 = checkbox.getAttribute("title");
		       System.out.println(att1);
		       System.out.println(att2);
		      
		       driver.quit();

	}
}
