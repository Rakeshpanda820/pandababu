package selenium_webdriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitstmt {
	
	
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//wait for Login btn : explicit wait
	WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions
	        .elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	//wait for emp info: page : implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	System.out.println("Logout completed");
	driver.close();
	}
}
