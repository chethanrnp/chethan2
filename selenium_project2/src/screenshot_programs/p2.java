package screenshot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		       driver.get("https://www.facebook.com/");
		       String title = driver.getTitle();
		       TakesScreenshot t=(TakesScreenshot) driver;
		       File src = t.getScreenshotAs(OutputType.FILE);
		       File dest =new File("./screenshot/"+title+".png");
		       FileUtils.copyFile(src, dest);

	}
}
