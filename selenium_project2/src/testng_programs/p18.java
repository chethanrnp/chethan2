package testng_programs;

import org.testng.annotations.Test;

public class p18 {
  
	 @Test(priority=1)
	 public void pooja() {
		 System.out.println("pooja script");
	 }
	 
	 @Test(priority=3)
	 public void disha() {
		 System.out.println("disha script");
	 }

	 @Test(priority=2)
	 public void shraddha() {
		 System.out.println("shraddha script");
	 }

}
