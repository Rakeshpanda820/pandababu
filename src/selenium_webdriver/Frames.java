package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Frames {
public static void main (String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	// Enter into Frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value ='Add']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Rakesh kumar");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Panda");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
