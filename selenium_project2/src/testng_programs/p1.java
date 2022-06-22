package testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 {

	 @BeforeSuite
	 public void beforeSuite()
	 {
		 System.out.println("before Suite");
	 }
	 
	 @AfterSuite
	 public void AfterSuite()
	 {
		 System.out.println("After Suite");
	 }
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("before Test");
	 }
	 @AfterTest
	 public void afterTest()
	 {
		 System.out.println("after test");
	 }
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("before Class");
	 }
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("after Class");
	 }
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("before Method");
	 }
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("after Method");
	 }
	 @Test
	 public void script()
	 {
		 System.out.println("script");
	 }
}
