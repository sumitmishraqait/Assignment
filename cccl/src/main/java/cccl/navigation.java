package cccl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class navigation {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
	 
	
	String appUrl = "http://www.DemoQA.com";
	driver.get(appUrl);
	Thread.sleep(5000);

	// Click on Registration link
	driver.findElement(By.cssSelector("#menu-item-374")).click();
Thread.sleep(5000);
driver.findElement(By.cssSelector("#name_3_firstname")).sendKeys("Sumit");
Thread.sleep(5000);
driver.findElement(By.cssSelector("#name_3_lastname")).sendKeys("Mishra");
Thread.sleep(5000);
driver.findElement(By.cssSelector("#name_3_lastname")).sendKeys("Mishra");
Thread.sleep(5000);

	// Go back to Home Page
	driver.navigate().back();
	Thread.sleep(5000);

	// Go forward to Registration page
	driver.navigate().forward();
	Thread.sleep(5000);
	// Go back to Home page
	driver.navigate().to(appUrl);
	Thread.sleep(5000);
	// Refresh browser
driver.navigate().refresh();
	Thread.sleep(5000);
	// Close browser
	driver.close();
}
}
