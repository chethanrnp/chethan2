package popUp_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownloadpopUp {

	 public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.selenium.dev/downloads/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//p[text()='Java']/..//a[@class='card-link'])[1]")).click();
	}
}
