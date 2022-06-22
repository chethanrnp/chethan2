package popUp_programs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 
		 // fetches the flipkart
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQjwxtSSBhDYARIsAEn0thTd94Hj7T0djVu6Prhxv6tWFnqdarDV0rpo3NCn3_LbMukYyqWouW0aAi7qEALw_wcB&gclsrc=aw.ds");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.alertIsPresent());
		 driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		 fileUpLoad("E:\\selenium_workspace\\selenium_project\\upload\\abhiResume.docx");
	}
	 public static void fileUpLoad(String path) throws Throwable {
		Thread.sleep(1000);
		StringSelection s=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		//presses on control+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		//releases control+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		//presses on enter
		r.keyPress(KeyEvent.VK_ENTER);
		//releases enter
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
