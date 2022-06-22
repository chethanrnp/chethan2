package apache_programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getdata("logincr", 1, 0));
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(getdata("logincr", 1, 1));
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
	 public static String  getdata(String sheet,int r,int c) {
		String d=null;
		try {
			 FileInputStream f=new FileInputStream("./data/excel.xlsx");
				Workbook book = WorkbookFactory.create(f);
				d= book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		} catch (Exception e) {
		
		}
		return d;
	}
}
