package exceldatadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pr13GenerateEmpDataIntoNewExcel {

	public static void main(String[] args) throws IOException {

		EmpDataClass edc = new EmpDataClass();

		//Create a blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		//Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet("EmpData");

		//Create row
		XSSFRow row = spreadsheet.createRow(0);

		Cell cell0 = row.createCell(0);
		cell0.setCellValue("Id");

		Cell cell1 = row.createCell(1);
		cell1.setCellValue("FirstName");

		Cell cell3 = row.createCell(2);
		cell3.setCellValue("LastName");
		
		Cell cell2 = row.createCell(3);
		cell2.setCellValue("Company");

		Cell cell4 = row.createCell(4);
		cell4.setCellValue("Salary");

		//Create a map write data
		Map <String, ArrayList<String>> testresults = new HashMap<String, ArrayList<String>>();

		for(int i=1; i<=1000; i++) {

			String id = ""+i;

			//Create a random number, get the first name, make the first letter caps and next letters small
			Random r=new Random();
			int randomNumber=r.nextInt(edc.firstnames.length);
			String firstname = edc.firstnames[randomNumber].substring(0,1).toUpperCase()+edc.firstnames[randomNumber].substring(1).toLowerCase();

			//Create a random number, get the last name, make the first letter caps and next letters small
			r=new Random();
			randomNumber=r.nextInt(edc.lastnames.length);
			String lastname = edc.lastnames[randomNumber].substring(0,1).toUpperCase()+edc.lastnames[randomNumber].substring(1).toLowerCase();
			
			r=new Random();
			randomNumber=r.nextInt(edc.companynames.length);
			String company = edc.companynames[randomNumber];

			int salary = (int)(100000.0 * Math.random());

			ArrayList<String> list1 = new ArrayList<String>();


			list1.add(firstname);
			list1.add(lastname);
			list1.add(company);
			list1.add(""+salary);

			testresults.put(id, list1);

		}

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

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  

		FileOutputStream out = new FileOutputStream(new File("./data/testresults"+dtf.format(now)+".xlsx"));
		workbook.write(out);
		out.close();
		workbook.close();

	}
}