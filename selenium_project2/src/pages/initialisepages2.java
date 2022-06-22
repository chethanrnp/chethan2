package pages;

import org.openqa.selenium.WebDriver;

public class initialisepages2 {

	public practice_pages practicepage;
	public practice_pages2 practicepage2;
	public practice_pages3 practicepage3;
	public practice_pages4 practicepage4;
	
	public initialisepages2(WebDriver driver) {
		this.practicepage=new practice_pages(driver);
		this.practicepage2=new practice_pages2(driver);
		this.practicepage3=new practice_pages3(driver);
		this.practicepage4=new practice_pages4(driver);
	}
}
