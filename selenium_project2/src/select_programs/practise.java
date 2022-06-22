package select_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().window().maximize();
		       driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	    closetab(driver);
	   WebElement element = driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]"));
	  int x = element.getLocation().getX();
	  int y = element.getLocation().getY();
	  JavascriptExecutor j=(JavascriptExecutor) driver;
      j.executeScript("window.scrollBy("+x+","+y+")");
      TakesScreenshot t=(TakesScreenshot) driver;
     File fileSrc = t.getScreenshotAs(OutputType.FILE);
     File dest=new File("./screenshot/p1.png");
     FileUtils.copyFile(fileSrc, dest);
	}
	public static void closetab(WebDriver driver) {
		String maintab = driver.getWindowHandle();
		Set<String> alltab = driver.getWindowHandles();
		for(String lv:alltab) {
			driver.switchTo().window(lv);
			if(lv.equals(maintab))
					driver.close();		
		}
	}
}
