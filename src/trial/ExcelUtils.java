package trial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	
	private static XSSFWorkbook ExcelWBook;
	
	private static XSSFRow Row;
	
	private static XSSFCell Cell;
	
	public static void setExcelFile(String Path, String SheetName) throws IOException {
		
		FileInputStream ExcelFile = new FileInputStream(Path);
		
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
	}



public static String getCellData(int RowNum, int ColNum) {
	
	Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	
	String CellData = Cell.getStringCellValue();
	
	return CellData;
	
}

public static void setCellData(String Result, int RowNum, int ColNum) {
	
	Row =ExcelWSheet.getRow(RowNum);
	
	Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
	
	if(Cell == null) {
		Cell = Row.createCell(ColNum);
		Cell.setCellValue(Result);
		
	} else {
		Cell.setCellValue(Result);
	}
	
	FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
	
	ExcelWBook.write(fileOut);
	
	fileOut.flush();
	
	fileOut.close();
	
}

}