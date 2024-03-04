package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC002_AddnewEmployee {
public static void main (String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Rakesh");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Panda");
	Thread.sleep(3000);
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("New Employee Added");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
