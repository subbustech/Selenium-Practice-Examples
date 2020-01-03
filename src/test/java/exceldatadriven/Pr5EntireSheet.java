package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr5EntireSheet {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("data/testdata.xlsx");

		//Create xssfworkbook object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		Iterator<Row> itrow = sheet.iterator();
		while(itrow.hasNext()) {
			
			//Get a row number
			Row row = itrow.next();

			Iterator<Cell> it = row.iterator();
			while(it.hasNext())
			{
				//Get the Cell
				Cell cell = it.next();
				DataFormatter df = new DataFormatter();
				String cellvalue = df.formatCellValue(cell);
				System.out.println(cellvalue);
			}
		}
		workbook.close();
	}

}
