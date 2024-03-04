package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
public class Drag_Drop {
	public static void main(String args[]) throws Exception{
	    //Test steps
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
	//Verify page title: cond-failed stop exe
//	           actual result
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title matched");
	//enter into frame
	driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),
	               driver.findElement(By.id("droppable"))).build().perform();
	Thread.sleep(3000);
	System.out.println("Drag & drop");
	driver.switchTo().defaultContent();
	driver.quit();
	}
}
