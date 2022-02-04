package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	
	WebElement userid = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
	String tsid = userid.getText();
//	System.out.println("The id is"+ tsid);
	
	driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
	driver.findElement(By.linkText("Delete")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(tsid);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//table[@id='ext-gen242']//button")).click();
	Thread.sleep(1000);
	
	WebElement note = driver.findElement(By.xpath("//div[text() ='No records to display']"));
	String notification= note.getText();
	System.out.println(notification);
	driver.close();
}

}
