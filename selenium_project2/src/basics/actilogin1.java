package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actilogin1 {

	 public static void main(String[] args) throws Throwable {
		 //sets the path for chromedriver
			System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			//launches the chrome browser
			WebDriver driver=new ChromeDriver();
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			//identifies username and enters data
			driver.findElement(By.className("textField")).sendKeys("admin");
			//identifies password and enters data
			driver.findElement(By.name("pwd")).sendKeys("manager");
			//clicks on login button
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(7000);
			String expectedlandinpagetitle ="actiTIME - Enter Time-Track";
			String expectedlandinpageurl="https://demo.actitime.com/user/submit_tt.do";
			String actuallandinpageurl = driver.getCurrentUrl();
			String actuallandinpagetitle = driver.getTitle();
			if(actuallandinpagetitle.equals(expectedlandinpagetitle)&&actuallandinpageurl.equals(expectedlandinpageurl))
				System.out.println("pass:login is sucessful");
			else
				System.out.println("fail:unable to login");
	}
}
