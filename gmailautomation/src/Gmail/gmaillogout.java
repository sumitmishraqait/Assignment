package Gmail;

import org.openqa.selenium.By;

public class gmaillogout extends Gmaillogin{
	//logout from gmail account
	
	public void logout() throws InterruptedException{
		
		driver.findElement(By.cssSelector(".gb_8a.gbii")).click();
		Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()='Sign out']")).click();
	}

}
