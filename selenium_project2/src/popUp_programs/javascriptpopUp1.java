package popUp_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptpopUp1 {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		   driver.get("https://demo.actitime.com/login.do");
		      driver.findElement(By.name("username")).sendKeys("admin");
		       //identifies password and enters data
		       driver.findElement(By.name("pwd")).sendKeys("manager");
		       //clicks on login button
		       driver.findElement(By.id("loginButton")).click();
		        driver.findElement(By.xpath("//a[@class='content users']")).click();
                //clicks on new user
		        driver.findElement(By.xpath("//div[text()='New User']")).click();
		        Thread.sleep(3000);
		        //enters the first name
		        driver.findElement(By.xpath("(//input[contains(@class,'firstNameField')])[2]")).sendKeys("abhi");
		        //clicks on close button
		        driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		        //switches the control to the js popUp
		        Alert a = driver.switchTo().alert();
		        //retrives the text from the popUp
		        String text = a.getText();
		        System.out.println(text);
		        //clicks on ok button
		       // a.accept();
		        //clicks on cancel
		        a.dismiss();
		        
	}
}
