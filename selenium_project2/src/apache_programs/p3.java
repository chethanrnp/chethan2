package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p3 {

	 public static void main(String[] args) throws Throwable {
		 //writes the data into excel
		 FileInputStream f=new FileInputStream("./data/excel.xlsx");
			Workbook book = WorkbookFactory.create(f);
			 book.getSheet("sheet1").createRow(6).createCell(0).setCellValue("anushka shetty");
			 FileOutputStream f1=new FileOutputStream("./data/excel.xlsx");
			 book.write(f1);
	}
}
