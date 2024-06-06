package com.nopecommerce.ExcelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String FetchTheDataFromExcel(String sheet, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fs= new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\Zoom.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(rownum);
		String value= r.getCell(cellnum).getStringCellValue().toString();
		
		wb.close();
		return value;
	}
public void StoreTheValueIntoExcel(int rownum, int cellnum, String data) throws IOException {
	
	FileInputStream fs= new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\Zoom.xlsx");
	Workbook wb= WorkbookFactory.create(fs);
	Sheet sh = wb.createSheet();
	Row r= sh.createRow(rownum);
	Cell ce=r.createCell(cellnum);
	ce.setCellValue(data);
	FileOutputStream fos = new FileOutputStream("C:\\Users\\bhara\\OneDrive\\Documents\\Zoom.xlsx");
	wb.write(fos);
	wb.close();
}
public int getRowNumber(String Sheet) throws IOException {
	FileInputStream fs= new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\Zoom.xlsx");
	Workbook wb= WorkbookFactory.create(fs);
	Sheet sh = wb.getSheet(Sheet);
	int rownum= sh.getLastRowNum();
	wb.close();
	return rownum;
}




}
