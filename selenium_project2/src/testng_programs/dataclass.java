package testng_programs;

import org.testng.annotations.DataProvider;

import apache_programs.p4;

public class dataclass {
      @DataProvider
	 public Object[][] adduserData() 
	 {
		 Object[][] ob=new Object[1][5];
		 ob[0][0]=p4.getdata("adduser", 1, 0);
		 ob[0][1]=p4.getdata("adduser", 1, 1);
		 ob[0][2]=p4.getdata("adduser", 1, 2);
		 ob[0][3]=p4.getdata("adduser", 1, 3);
		 ob[0][4]=p4.getdata("adduser", 1, 4);
		
		 return ob;
	 }
}
