package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver(); 		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geethanjali");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gunasekaran");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("geetha@test.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840186069");
		driver.findElement(By.name("submitButton")).click();
		driver.close();

	}

}
