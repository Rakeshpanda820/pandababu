package selenium_webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_allRows {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("E:\\\\Adactin\\\\test cases\\\\xls file\\\\TestCase_adactin.xls");
		Workbook  wb = Workbook.getWorkbook(file);
		Sheet  st = wb.getSheet(0);
		int rowcount = st.getRows();
		System.out.println(rowcount);
		for(int i=1; i<rowcount;i++ ) {
		String TC= st.getCell(0,i).getContents();
		String TS = st.getCell(1,i).getContents();
		String Teststeps = st.getCell(2,i).getContents();
		String Testdata = st.getCell(3,i).getContents();
		
		System.out.println(TC+"||"+TS+"||"+Teststeps+"||"+Testdata);

	}

	}
	}
