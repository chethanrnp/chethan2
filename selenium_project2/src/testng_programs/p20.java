package testng_programs;

import org.testng.annotations.Test;

public class p20 {

	 @Test(invocationCount=10)
	 public void pooja() {
		 System.out.println("pooja script");
	 }
	 
	 @Test
	 public void disha() {
		 System.out.println("disha script");
	 }

	 @Test
	 public void shraddha() {
		 System.out.println("shraddha script");
	 }
}
