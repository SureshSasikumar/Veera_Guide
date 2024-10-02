package veeraguide;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UibankRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//driver.findElement(By.xpath("username")).sendKeys("sasisuresh.s");
		//driver.findElement(By.id("").click();
		
		driver.findElement(By.id("username")).sendKeys("sasikumar");
		driver.findElement(By.id("password")).sendKeys("Dsasikumar@123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//button[text()='I agree to the Privacy Policy ']")).click();
//		
//		driver.findElement(By.xpath("//small[text()='Register For Account']/parent::a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("email")).sendKeys("sasisuresh.s@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Dsasikumar@123");
//		
//		driver.findElement(By.id("firstName")).sendKeys("sasi");
//		driver.findElement(By.id("lastName")).sendKeys("suresh");
//		driver.findElement(By.id("middleName")).sendKeys("s");
//		
//        WebElement sex = driver.findElement(By.id("sex"));
//		Select sx = new Select(sex);
//		sx.selectByIndex(1);
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("age")).sendKeys("12/04/89");
//		
//        WebElement ms = driver.findElement(By.id("maritalStatus"));
//    	Select mst = new Select(ms);
//		mst.selectByIndex(2);
//		Thread.sleep(1000);
//		
//		WebElement titel = driver.findElement(By.id("title"));
//		Select sd = new Select(titel);
//		sd.selectByVisibleText("Mr");
//		Thread.sleep(1000);
//		
//		WebElement ems = driver.findElement(By.id("employmentStatus"));
//		
//		Select em = new Select(ems);
//		em.selectByValue("Full-time");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("username")).sendKeys("sasikumar");
//		
//		driver.findElement(By.id("agreeCheckbox")).click();
//		
//		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

}



