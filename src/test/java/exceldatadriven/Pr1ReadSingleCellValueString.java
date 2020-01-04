package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr1ReadSingleCellValueString {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("data/testdata.xlsx");
		
		//Create xssfworkbook object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//Get a row number
		Row row = sheet.getRow(1);
		
		//Get a cell number
		Cell cell = row.getCell(1);
		
		//Get that cell value
		System.out.println(cell.getStringCellValue());
		
		workbook.close();


	}

}
