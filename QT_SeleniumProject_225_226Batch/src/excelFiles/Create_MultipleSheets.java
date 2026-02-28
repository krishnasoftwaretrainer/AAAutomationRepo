package excelFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_MultipleSheets {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("FirstSheet");
		XSSFSheet sheet2=workbook.createSheet("SecondSheet");
		XSSFSheet sheet3=workbook.createSheet("ThirdSheet");
		XSSFSheet sheet4=workbook.createSheet("FourthSheet");
		XSSFSheet sheet5=workbook.createSheet("KrishnaSheet");
		
		FileOutputStream fileout=new FileOutputStream("D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\SingleSheet.xlsx");
		workbook.write(fileout);
		
		System.out.println("Sheets created successfully");
		
	}

}
