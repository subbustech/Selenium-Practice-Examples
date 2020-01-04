package exceldatadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr10WriteDateIntoOneCellExistingExcel {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			//Get access to the workbook
			fis = new FileInputStream("data/testdata.xlsx");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}

		//Create workbook object
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Get the sheet you want
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		//Get the column names row
		Row row = sheet.getRow(0);

		int actualcol = 0;
		boolean colfound = false;

		Iterator<Cell> cells = row.iterator();
		while(cells.hasNext()) {
			Cell cell = cells.next();
			DataFormatter df = new DataFormatter();
			String cellvalue = df.formatCellValue(cell);

			if(cellvalue.equalsIgnoreCase("salary")) {
				actualcol = cell.getColumnIndex();
				colfound = true;
			}

			if(colfound) {
				break;
			}
		}

		try {
			fis.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		FileOutputStream fos = null;

		try {
			//Get access to the workbook
			fos = new FileOutputStream("data/testdata.xlsx");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}

		Row rowtoput = sheet.getRow(1);
		Cell celltoput = rowtoput.createCell(actualcol);
		celltoput.setCellValue("100000");
		try {
			workbook.write(fos);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			fos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
