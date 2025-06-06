package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData(String excelPath,   String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//To specify the path of excel file
		Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//To get into the sheet
		Row row = sheet.getRow(rowNo);//To get into the row
		Cell cell = row.getCell(cellNo);//To get into cell
		String data = cell.toString();//To fetch into the cell
		return data;//To return the fetched data back to the calling method
	}

	public String readpropertyData(String propPath,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(propPath);// To specify the path of property file
		Properties prop = new Properties();//Creating object of properties class to access NSMs
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
	}
	public int getLastRowCount(String excelPath, String sheetName ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);//To specify the path of excel file
		Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//To get into the sheet
		int rc = sheet.getLastRowNum();//To get the no. of rows present in the sheet
		return rc;
	}
		
}
