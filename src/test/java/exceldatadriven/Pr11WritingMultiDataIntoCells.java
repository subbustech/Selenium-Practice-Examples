package exceldatadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr11WritingMultiDataIntoCells {

	public static void main(String[] args) throws IOException {
		//Create a blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet("Results");
		
		//Create row
		XSSFRow row = spreadsheet.createRow(0);
		
		
		Cell cell0 = row.createCell(0);
		cell0.setCellValue("Test Case");
		
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("First Test");
		
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Result");
		
		Cell cell3 = row.createCell(3);
		cell3.setCellValue("Second Test");
		
		Cell cell4 = row.createCell(4);
		cell4.setCellValue("Result");
		
		//Create a map write data
		Map <String, ArrayList<String>> testresults = new HashMap<String, ArrayList<String>>();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList<String> list4 = new ArrayList<String>();
		
		list1.add("DB Test");
		list1.add("Pass");
		list1.add("UI Test");
		list1.add("Pass");
		testresults.put("1", list1);
		
		list2.add("DB Test");
		list2.add("Fail");
		list2.add("UI Test");
		list2.add("Pass");
		testresults.put("2", list2);
		
		list3.add("DB Test");
		list3.add("Pass");
		list3.add("UI Test");
		list3.add("Fail");
		testresults.put("3", list3);
		
		list4.add("DB Test");
		list4.add("Fail");
		list4.add("UI Test");
		list4.add("Fail");
		testresults.put("4", list4);

		System.out.println(testresults);
		for(Entry<String, ArrayList<String>> mp1: testresults.entrySet()) {
			row = spreadsheet.createRow(Integer.parseInt(mp1.getKey()));
			Cell cellnew = row.createCell(0);
			cellnew.setCellValue(mp1.getKey());
			
			for(int i=1; i<=mp1.getValue().size(); i++) {
				cellnew = row.createCell(i);
				cellnew.setCellValue(mp1.getValue().get(i-1));
			}
		}
		FileOutputStream out = new FileOutputStream(new File("./data/testresults.xlsx"));
		workbook.write(out);
	    out.close();
	    workbook.close();
		
	}
}