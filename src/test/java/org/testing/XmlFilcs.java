package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XmlFilcs {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\hsbib\\eclipse-workspace\\MavenProje\\src\\test\\resources\\Book1.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		int rowcount= sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int cellcount = row.getPhysicalNumberOfCells();
		System.out.println(cellcount);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.print("   "+cell2);
			}
			
			System.out.println();
			
		}
		
	}
	

}
