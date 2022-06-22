package webelement_program;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {
 public static String getdata(String path,String sheet,int r,int c) {
	String d=null;
	try {
		FileInputStream f=new FileInputStream(path);
	    Workbook book = WorkbookFactory.create(f);
	    book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
	} catch (Exception e) {
		
	}
	return d;
}
	 public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	closetab(driver);
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Free Trial'])[3]")));
	WebElement element = driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]"));
	int x = element.getLocation().getX();
	int y = element.getLocation().getY();
	Thread.sleep(3000);
 Actions a=new Actions(driver);
 a.moveToElement(element).perform();

	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File f=new File("./screenshot/p1.png");
	//FileUtils.copyFile(src, f);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Start Free Trial'])[3]")));
	//driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]")).click();
	driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys(getdata("./data/excel.xlsx", "Sheet1", 0, 0));
	driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys(getdata("./data/excel.xlsx", "Sheet1", 1, 0));
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
