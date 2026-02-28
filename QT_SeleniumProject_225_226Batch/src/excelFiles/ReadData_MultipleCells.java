package excelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_MultipleCells {

	public static void main(String[] args) throws IOException {
		
		FileInputStream filein = new FileInputStream(
				"D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\WriteDataMultipleCells.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(filein);
	XSSFSheet sheet1=workbook.getSheetAt(0);
	
	for(int r=0;r<=sheet1.getLastRowNum();r++)  //0<2 1<2 2<2 F 4
	//for(int r=0;r<=2;r++)
	{
		XSSFRow row=sheet1.getRow(r);
		
		for(int c=0;c<row.getLastCellNum();c++)  //5 2
		{
			String celldata=row.getCell(c).getStringCellValue();
			System.out.print(celldata+" || ");
		}
		System.out.println();
	}
		
		
	}

}
