package selenium_webdriver;
import java.io.FileInputStream; //Read
import java.io.FileNotFoundException;
import java.io.FileOutputStream;//Write
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel_POI {

	public static void main(String[] args) throws Exception   {
		    FileInputStream fileinput = new FileInputStream("‪E:\\Adactin\\test cases\\TestCase_adactin.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		    XSSFSheet sheet = workbook.getSheet("test");
		    System.out.println(sheet.getSheetName());
		    System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data "+
		                                      sheet.getRow(2).getCell(1));
		 // Write the data to excel file
	    XSSFCell cell =  sheet.getRow(2).getCell(1);
	    cell.setCellValue("Test123");
	    fileinput.close();
	    FileOutputStream fileOut = new FileOutputStream("‪E:\\Adactin\\test cases\\TestCase_adactin.xlsx");
	    workbook.write(fileOut);
	    System.out.println("Updated data after write is done " + cell.getStringCellValue());
	    fileOut.close();
		   
	}

}
