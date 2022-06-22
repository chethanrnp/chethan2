package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p1 {

	public static void main(String[] args) throws Throwable {
		//reads the data from the exel
		FileInputStream f=new FileInputStream("./data/excel.xlsx");
		Workbook book = WorkbookFactory.create(f);
		String d = book.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
           System.out.println(d);
           String e = book.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
           System.out.println(e);
           String f1 = book.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
           System.out.println(f1);
           
	}

}
