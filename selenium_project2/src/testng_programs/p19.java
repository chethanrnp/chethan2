package testng_programs;

import org.testng.annotations.Test;

public class p19 {

	 @Test(priority=0)
	 public void pooja() {
		 System.out.println("pooja script");
	 }
	 
	 @Test(priority=15)
	 public void disha() {
		 System.out.println("disha script");
	 }

	 @Test(priority=-10)
	 public void shraddha() {
		 System.out.println("shraddha script");
	 }
}
