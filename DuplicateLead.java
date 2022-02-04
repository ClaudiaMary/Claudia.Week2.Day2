package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String lfname = fname.getText();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		
		//WebElement name = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		//String lname = name.getText();
		
		
		
		WebElement tit = driver.findElement(By.xpath("//div[text() ='Duplicate Lead']"));
		String title = tit.getText();
		
		if (title.equalsIgnoreCase("Duplicate Lead")) {
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			
		}
		Thread.sleep(2000);
		WebElement firname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String leadfirname= firname.getText();
		
		if(lfname.equalsIgnoreCase(leadfirname)) {
			System.out.println("First name matches");
		}
		else {
			System.out.println("First name doesnt match");
		}
	}
	
}
