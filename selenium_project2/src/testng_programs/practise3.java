package testng_programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class practise3 {

	 @DataProvider
	 public Object[][] actilogindata()  {
		 Object [][] ob=new Object[1][5];
		 ob[0][0]=practise3.data("./data/excel.xlsx", "adduser" ,1, 0);
		 ob[0][1]=practise3.data("./data/excel.xlsx", "adduser" ,1, 1);
		 ob[0][2]=practise3.data("./data/excel.xlsx", "adduser" ,1, 2);
		 ob[0][3]=practise3.data("./data/excel.xlsx", "adduser" ,1, 3);
		 ob[0][4]=practise3.data("./data/excel.xlsx", "adduser" ,1, 4);
		 return ob;
	 }
	 public static String data(String path,String sheet,int r,int c) {
		String d=null;
		try {
			FileInputStream f=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f);
			d=book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return d;
	}
}
