package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class WebTable {

public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();
   driver.get("E:\\Html file & EXCEL jar files/WebTable.html");
   //retrive count
   int Row =driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
   int Col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
   int Row_Col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
   System.out.println("Row Count" + Row);
   System.out.println("Col Count " + Col);
   System.out.println("Row_Col Count " + Row_Col);
   // retrive data
   String celldata = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[4]/td[3]")).getText();
   System.out.println(celldata);
   // retrive all the table data
   for (int i=1;i<=Row;i++) {
	   String data = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
	   System.out.println(data);
   }
   driver.close();
	}

}
