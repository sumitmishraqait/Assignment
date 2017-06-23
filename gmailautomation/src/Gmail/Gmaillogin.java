package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {

	static WebDriver driver;
		
		public  void signin()
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		/**Scripts for Login Gmail Accounts 
		*/  

		  // Enter user id  
		   // driver.findElement(By.id("identifierId")).sendKeys("sumit.mishra018@gmail.com");
		    driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("sumit.mishra018@gmail.com");
		  
		  // Click on Next Button
		    // driver.findElement(By.id("identifierNext")).click();
		    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		  
		    
		  // sleep for 5 seconds
		  try {
		    Thread.sleep(2000);
		   } catch (InterruptedException e) {
		     System.out.println(e);
		    }
		  //Enter your password
		    //driver.findElement(By.className("whsOn").className("zHQkBf")).sendKeys("9920870091");
		    driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("9920870091");
		  
		  
		  //click on password Next
		    //driver.findElement(By.className("RveJvd")).click(); 
		 // driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		  driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

	

}
	
}