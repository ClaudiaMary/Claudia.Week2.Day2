package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter UserName and Password Using Id Locator
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("claudia");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("mary");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("claudia");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("mary");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("ITSEM");
		
		
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("ITSEM Dept");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("shelbydonata@gmail.com");
		
		
				WebElement source = driver.findElement(By.xpath("//select[@id ='createContactForm_generalStateProvinceGeoId']"));
				Select prov = new Select(source);
				prov.selectByVisibleText("California");
				
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("important");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("claudia mary"));
		
		
	}

}
