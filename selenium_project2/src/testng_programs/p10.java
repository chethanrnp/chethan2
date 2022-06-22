package testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p10 {

	 @DataProvider
	 public Object[] getdata() 
	 {
		 Object[] ob=new Object[4];
		 ob[0]=100;
		 ob[1]=25.55f;
         ob[2]="java";
		 ob[3]=true;
		 return ob;
		 }
	 @Test(dataProvider ="getdata")
	 public void script(Object ob1) 
	 {
		 System.out.println(ob1);
	 }
}
