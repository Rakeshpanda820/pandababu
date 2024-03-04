package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import org.openqa.selenium.By;
public class TC004_DeleteEmployee {
	public static void main (String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("loc_name")).sendKeys("1268");
		
}
}