package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
public class Practise1 {//Robot class,Mousehover//
public static void main(String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	String UN = "nareshit";
	String PW="nareshit";
	driver.get("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUserName")).sendKeys(UN);
	driver.findElement(By.name("txtPassword")).sendKeys(PW);
	driver.findElement(By.name("Submit")).click();
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Reset']")).click();
	Robot R=new Robot();
	R.keyPress(KeyEvent.VK_TAB);
	R.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	R.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	R.keyRelease(KeyEvent.VK_ENTER);
	driver.switchTo().defaultContent();
	driver.quit();
	
}
}
