package Commons;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private static String cellValue;
	private static Workbook excelWB;
	private static Sheet excelSheet;
	private static Row ROW;
	private static Cell CELL;
	
	public static void setExeceFile(String filePath, String sheetName) throws Exception{
		FileInputStream inputFile = new FileInputStream(filePath);
		excelWB = new XSSFWorkbook(inputFile);
		excelSheet = excelWB.getSheet(sheetName);
	}
	
	
	//Row number from 1, column number from 0
	public static String readCellValues(int rowNum, int colNum) throws Exception{
		ROW = excelSheet.getRow(rowNum);
		CELL = ROW.getCell(colNum);
		cellValue = CELL.toString();
		
		return cellValue;
	}
	
	public static void writeCellValues(int rowNum, int colNum, String cellValue, String filePath) throws Exception{
		ROW = excelSheet.getRow(rowNum);
		CELL = ROW.getCell(colNum);
		if(CELL == null){
			CELL = ROW.createCell(colNum);
			CELL.setCellValue(cellValue);
		} else {
			CELL.setCellValue(cellValue);
		}
		
		FileOutputStream fileOutput = new FileOutputStream(filePath);
		excelWB.write(fileOutput);
		fileOutput.flush();
		fileOutput.close();
		
	}

}
