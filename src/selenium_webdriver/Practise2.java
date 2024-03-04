package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class Practise2 {
public static void main(String args[]) throws Exception {
	WebDriver driver =new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login successful");
	driver.switchTo().frame("rightMenu");
	Select st =new Select(driver.findElement(By.name("loc_code")));
	Thread.sleep(2000);
	st.selectByVisibleText("Emp. First Name");
	driver.findElement(By.id("loc_name")).sendKeys("Rakesh");
	driver.findElement(By.xpath("//input[@type='button']")).click();
	System.out.println("search employyee firstname successful");
	driver.switchTo().defaultContent();
	driver.close();


	
}
}