package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr8UtilityCalssReturnsMap {
	public Map<Integer, Map<String, String>> returnData(String path, String sheetName) throws IOException{
		//Create a map of integer and map. The second map is a map of String and String
		//The first integer is the record number in excel
		//Second map is the column name and string value
		Map<Integer, Map<String, String>> allrowsdata = new HashMap<Integer, Map<String, String>>();

		List<String> columnnames = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(path);

		//Create xssfworkbook object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet(sheetName);

		Iterator<Row> itrow = sheet.iterator();

		while(itrow.hasNext()) {
			//Define a map to hold the single row data
			Map<String, String> singlerowdata = new HashMap<String, String>();

			//Get a row number
			Row row = itrow.next();

			//If the row number is zero add it to the list of column names
			if(row.getRowNum() == 0) {
				Iterator<Cell> it = row.iterator();
				while(it.hasNext())
				{
					//Get the Cell
					Cell cell = it.next();
					DataFormatter df = new DataFormatter();
					String cellvalue = df.formatCellValue(cell);
					columnnames.add(cellvalue);
				}
			}
			//If the row number is not zero add it to the map
			if(row.getRowNum() != 0) {
				Iterator<Cell> it = row.iterator();
				while(it.hasNext())
				{
					//Get the Cell
					Cell cell = it.next();
					DataFormatter df = new DataFormatter();
					String cellvalue = df.formatCellValue(cell);

					singlerowdata.put(columnnames.get(cell.getColumnIndex()), cellvalue);
				}
				allrowsdata.put(row.getRowNum(), singlerowdata);
			}
		}
		workbook.close();
		return allrowsdata;
	}
}
