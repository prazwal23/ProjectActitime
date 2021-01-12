package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	public String getPropertyValue(String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/commondata.properties.txt");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(Key);
		return value;
	}
	public String getExcelValue(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	public void setExcelValue(String value, String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx.xlsx");
		wb.write(fos);
		wb.close();
	}
}
