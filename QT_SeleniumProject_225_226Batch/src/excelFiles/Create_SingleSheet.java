package excelFiles;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Create_SingleSheet
{

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("Krishna");
		
		
		FileOutputStream fileout=new FileOutputStream("D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\SingleSheet.xlsx");
		workbook.write(fileout);
		
		System.out.println("Sheet created successfully");
		
		
	}

}
