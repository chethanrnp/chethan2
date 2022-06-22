package synchronisation_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {

	 public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
            driver.manage().window().maximize();
		       driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'mobile')]")));
	 List<WebElement> element = driver.findElements(By.xpath("//div[contains(text(),'mobile')]"));
	for( WebElement lv:element) {
		String text=lv.getText();
		if(text.equals("mobile under 15000")) {
			lv.click();
			break;
		}
	}
     Thread.sleep(7000);
	
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[contains(@class,'size')]")));
	List<WebElement> name = driver.findElements(By.xpath("//h2[contains(@class,'size')]"));
	 List<WebElement> price = driver.findElements(By.xpath("//h2[contains(@class,'size')]/../..//span[@class='a-price-whole']"));
	TreeMap<Integer, String> t=new TreeMap<>();
	for (int i = 0; i < name.size(); i++) {
		String st=name.get(i).getText();
		int it=Integer.parseInt(price.get(i).getText().replace(",", "").substring(1));
		t.put(it, st);
	}
	for(Entry<Integer, String> lv:t.entrySet()) {
		System.out.println(lv.getValue()+"="+lv.getKey());
	}
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Redmi')])[1]")));
	driver.findElement(By.xpath("(//span[contains(text(),'Redmi')])[1]")).click();
	closetab(driver);
	//Thread.sleep(7000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
  WebElement element1 = driver.findElement(By.xpath("//a[text()='Facebook']"));
  int x = element1.getLocation().getX();
           int y = element1.getLocation().getY();
           JavascriptExecutor j=(JavascriptExecutor) driver;
           j.executeScript("window.scrollBy("+x+","+y+")");
           TakesScreenshot tk=(TakesScreenshot) driver;
           File src = tk.getScreenshotAs(OutputType.FILE);
           File pic=new File("./screenshot/p1.png");
           FileUtils.copyFile(src, pic);
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
