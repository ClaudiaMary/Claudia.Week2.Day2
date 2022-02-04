package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-tab-panel-body x-tab-panel-body-top']//div/div/div//div[2]//div//input")).sendKeys("d");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		WebElement head = driver.findElement(By.xpath("//div[text()='View Lead']"));
		String tihead= head.getText();
		//System.out.println(tihead);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		String newcompanyname = "CTS";
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(newcompanyname);
		
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//table//tbody//tr[12]//td[2]//input")).click();
		
		WebElement cname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String newcname = cname.getText();
		
		boolean contains = newcname.contains(newcompanyname);
		System.out.println("New company name is updated" + contains);
	}

}
