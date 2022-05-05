package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getTestData(int row,int cell,String sheetname) throws IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Documents\\LOGIN.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
		

	}
}
