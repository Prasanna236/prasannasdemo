package org.FB.Payment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		// Location of the Excel File
		File f = new File("D:\\Eclipse_Workspace\\Maven09.30pm\\Excel\\InputData.xlsx");

		// to read the value from excel
		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Data");

		// To get the Row Count
		int rowCount = s.getPhysicalNumberOfRows();

		// to iterate the rows
		for (int i = 0; i < rowCount; i++) {

			Row r = s.getRow(i);

			int cellCount = r.getPhysicalNumberOfCells();

			// to iterate the cells/columns
			for (int j = 0; j < cellCount; j++) {

				Cell c = r.getCell(j);

				int type = c.getCellType();

				if (type == 1) {

					// String
					String val = c.getStringCellValue();
					System.out.println(val);

				} else if (DateUtil.isCellDateFormatted(c)) {

					// Date
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
					String val = sim.format(d);
					System.out.println(val);

				} else {

					// Number
					double d = c.getNumericCellValue();
					// Type Casting
					long l = (long) d;
					String val = String.valueOf(l);
					System.out.println(val);
				}
			}

		}

	}

}
