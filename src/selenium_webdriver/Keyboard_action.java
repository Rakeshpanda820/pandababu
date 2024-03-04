package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class Keyboard_action {
public static void main (String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(4000);
    System.out.println("ENTER");
    System.out.println("Login completed");
    driver.findElement(By.linkText("Logout")).click();
    System.out.println("Logout completed");
    driver.close();

}
}
