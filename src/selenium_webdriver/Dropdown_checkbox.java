package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class Dropdown_checkbox {
public static void main (String args[]) throws Exception {
WebDriver driver = new ChromeDriver();	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
   Thread.sleep(3000);
driver.switchTo().frame("rightMenu");

Select st = new Select(driver.findElement(By.name("loc_code")));
st.selectByIndex(1);
Thread.sleep(3000);
driver.findElement(By.name("loc_name")).sendKeys("1662");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.name("chkLocID[]")).click();
driver.findElement(By.xpath("//input[@value='Delete']")).click();

driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
driver.close();
	}
}
