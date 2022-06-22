package testng_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class p23 {

	 @Test
	 public void script() {
		 System.out.println("from script1");
	 }
	 
	 @Test
	 public void script1() {
		 Reporter.log("from script2", false);
	 }

	 @Test
	 public void script3() {
		 Reporter.log("from script3", true);
	 }

}
