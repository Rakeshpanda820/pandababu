package selenium_webdriver;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
public class Excel {
public static void main (String args[]) throws Exception   {
 FileInputStream file = new FileInputStream("E:\\Adactin\\test cases\\xls file\\TestCase_adactin.xls");
 Workbook  wb = Workbook.getWorkbook(file);
 Sheet  st = wb.getSheet(0);
 int row = 16;
 String TC = st.getCell(0,row).getContents();
 String TS = st.getCell(1,row).getContents();
 String Teststeps= st.getCell(2,row).getContents();
 String testdata= st.getCell(3,row).getContents();
 String Er= st.getCell(4,row).getContents();
 System.out.println(TC+"||"+TS+"||"+Teststeps+"||"+testdata+"||"+Er); 
 }
}

