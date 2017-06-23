package cccl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class csso {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//String var="";
		
		driver.get("https://www.gmail.com");
		System.out.println("Title is  " +driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.cssSelector("input#identifierId"));
		ele1.sendKeys("krhoney7@gmail.com");
		//WebElement ele3=driver.findElement(By.cssSelector("button.uBOgn"));
		//ele3.click();
		//driver.navigate().back();
		
		//WebElement ele4=driver.findElement(By.cssSelector(".LJtPoc"));
		//ele4.sendKeys("abc@gmai.com");
		WebElement ele2=driver.findElement(By.cssSelector("#identifierNext"));
		ele2.click();
		WebElement el3=driver.findElement(By.cssSelector("input#password"));
		el3.sendKeys("krhoney7@gmail.com");
		
	}

}
