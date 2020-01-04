package exceldatadriven;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Pr9CallingUtilityClassPr8 {
	
	public static void main(String[] args) throws IOException {
		
		Pr8UtilityCalssReturnsMap Pr8Object = new Pr8UtilityCalssReturnsMap();
		
		String path = "data/testdata.xlsx";
		String sheetName = "Sheet1";
		Map<Integer, Map<String, String>> data = new HashMap<Integer, Map<String, String>>();
		data = Pr8Object.returnData(path, sheetName);
		
		System.out.println(data);
	}
	
}
