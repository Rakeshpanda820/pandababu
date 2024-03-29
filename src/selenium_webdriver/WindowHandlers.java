package selenium_webdriver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandlers {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new ChromeDriver();
	//1st wind
	driver.get("file:///E:\\Html file & EXCEL jar files/multiplewindows.html");
	Thread.sleep(3000);
	//2nd wind
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	//3rd wind
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
	//switch To 1st wind;
	driver.switchTo().window(windinfo.get(0));
	Thread.sleep(3000);
	//driver.close();
	driver.quit();
	}
	}

