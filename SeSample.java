package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeSample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Facebook Create account
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Claudia");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mary");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9500003228");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9500003228");
		driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("month")).sendKeys("Oct");
		driver.findElement(By.id("year")).sendKeys("1978");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
	}

}
