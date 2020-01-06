package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr16DifferentExcelMethods {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("data/testdata.xlsx");
		
		//Create xssfworkbook object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//workbook.getActiveSheetIndex(); //Gets the Active sheet 
		//workbook.createSheet(); //Create new sheet with default name like Sheet2
		//workbook.createSheet("TestSheet"); //Create new sheet with name "TestSheet"
		//workbook.getNumberOfSheets()); //Get number of sheets
		//workbook.getSheetIndex("Sheet1")); //Gets the sheet index of Sheet1.
		//workbook.getSheetName(0)); //Gets the sheet at 0 index
		
		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//XSSFSheet sheet = workbook.getSheetAt(0) //Get the sheet by using index
		//sheet.getLastRowNum(); //Gets the last row number
		//sheet.getFirstRowNum(); //Gets the first row number
		//sheet.getSheetName(); //Gets the sheet name
		//sheet.isSelected(); //Checks if the sheet is selected
		//sheet.isSheetLocked(); //Checks if the sheet is locked
		//sheet.createRow(0); //Creates a new row at row position zero
		
		//Get a row number
		Row row = sheet.getRow(1);
		//row.createCell(0);//Creates a new cell at 0 index
		//row.createCell(0, CellType.STRING); //Creates a new cell at 0 index of type String
		//row.getCell(0); //Gets the cell at 0 index return type is Cell object
		//row.getFirstCellNum(); //Gets the first cell index
		//row.getHeight(); //Gets the row height
		//row.getLastCellNum(); //Returns last cell number and not index
		//row.getPhysicalNumberOfCells(); //Returns the number of cells in that row
		//row.getRowNum(); //Gets the current row number starting from 0
		
		//Get a cell number
		Cell cell = row.getCell(1);
		//cell.getCellType();//gets the cell type. Return type is CellType. You have to use CellType.STRING() to compare
		//cell.getColumnIndex()); //GEts the column index
		//cell.getDateCellValue();//Gets the data from the cell
		//cell.getNumericCellValue(Number); //Get the numeric value from the cell
		//cell.getStringCellValue(String); //Get the text value from the cell
		//cell.setCellValue(Date); //Sets a date value to the cell
		//cell.setCellValue(String);//Sets a string value to the cell

		System.out.println(cell.getStringCellValue());
		
		workbook.close();

	}

}
