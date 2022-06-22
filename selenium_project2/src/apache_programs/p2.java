package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p2 {

	 public static void main(String[] args) throws Throwable {
		 //overwrites the data
		 FileInputStream f=new FileInputStream("./data/excel.xlsx");
			Workbook book = WorkbookFactory.create(f);
			 book.getSheet("sheet1").getRow(2).getCell(0).setCellValue("krithi shetty");
			 FileOutputStream f1=new FileOutputStream("./data/excel.xlsx");
			 book.write(f1);
	}
}
