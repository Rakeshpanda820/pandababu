package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class Alerts_popups {
public static void main (String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
    Alert al= driver.switchTo().alert();
    System.out.println(al.getText());
    al.accept();
	
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
