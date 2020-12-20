package org.FB.Payment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {

		// To Update the Data into Excel File
		File f = new File("D:\\Eclipse_Workspace\\Maven09.30pm\\Excel\\OutputData.xlsx");

		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Data");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		
		String value = c.getStringCellValue();

		System.out.println(value);
		
		if(value.equals("Java")) {
			c.setCellValue("Selenium");
			
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
		}
		
		System.out.println("Done");

	}

}
