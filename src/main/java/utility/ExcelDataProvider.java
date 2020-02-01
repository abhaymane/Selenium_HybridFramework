package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook workbook;
	//freecrm_login
	public ExcelDataProvider(){
		try {
			FileInputStream fins=new FileInputStream(new File(".//TestData//testdata.xlsx"));
			workbook=new XSSFWorkbook(fins);
		}
		catch(Exception e) {
			
			
		}
		
	}
	public String getStringCellData(int sheetindex,int row,int column) {
		return workbook.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
		
	}
	public String getStringCellData(String sheetname,int row,int column) {
		return workbook.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	public int getNumericCellData(String sheetname,int row,int column) {
		return (int)workbook.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
		
	}
	public int getNumericCellData(int sheetindex,int row,int column) {
		return (int) workbook.getSheetAt(sheetindex).getRow(row).getCell(column).getNumericCellValue();
		
		
	}

}
