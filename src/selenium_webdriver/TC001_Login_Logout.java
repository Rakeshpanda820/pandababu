package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC001_Login_Logout {
public static void main(String args[])throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	if (driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("title matched");
	}else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
		
	}
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	
	Thread.sleep(3000);
	if (driver.getTitle().equals("OrangeHRM")) {
		System.out.println("title matched");
	}else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}  //perform mouse over 
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);

	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
	}
}//complete login logout testcase
