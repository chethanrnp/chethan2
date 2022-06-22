package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class p21 {

	 @Test
	 public void loginScript() {
		 System.out.println("login script");
	 }
	 
	 @Test(dependsOnMethods= {"loginScript"})
	 public void UsersScript() {
		 System.out.println("users script");
		 Assert.fail();
	 }
	 
	 @Test(dependsOnMethods= {"loginScript","UsersScript"})
	 public void adduserScript() {
		 System.out.println("adduser script");
	 }
}
