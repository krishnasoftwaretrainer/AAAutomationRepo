package excelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_SingleCell {
	public static void main(String[] args) throws IOException {

FileInputStream filein = new FileInputStream(
				"D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\WriteDataSingleCell.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(filein);
	//XSSFSheet sheet1 = workbook.getSheet("FirstSheet");
	XSSFSheet sheet1 = workbook.getSheetAt(0);
	XSSFRow row = sheet1.getRow(2);
	String celldata=row.getCell(3).getStringCellValue();
	//double celldata=row.getCell(10).getNumericCellValue();
	
	//int celldata=(int) row.getCell(10).getNumericCellValue();
	
	System.out.println(celldata);
	workbook.close();

	}

}
