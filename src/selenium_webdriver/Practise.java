package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class Practise {
	
	
//(TITLE/ALERTS/FRAMES/DRAG&DROP/EMPLASTNAME CHANGE/UPLOAD PHOTO )
	
	
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title not matched");
			
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
        Select st=new Select(driver.findElement(By.id("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys("2628");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.linkText("Rakesh Kumar Panda")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnEditPers")).click();
		driver.findElement(By.name("txtEmpLastName")).clear();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Panda");
		System.out.println("emp lastname is changed successfully");
		Thread.sleep(2000);
		driver.findElement(By.name("EditMain")).click();
		driver.findElement(By.xpath("//img[@title='Click to edit photo']")).click();
		System.out.println("upload photo window is displayed");
		WebElement fileInput = driver.findElement(By.id("photofile"));
		fileInput.sendKeys("D:\\SISTER's MARRIGE\\New folder\\M\\_MG_0708.JPG");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println("photo upload is successful");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
